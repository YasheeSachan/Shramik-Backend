package com.FYP.shramik1.Controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class NotificationController {
	
	public static final String ACCOUNT_SID = "AC3ffb3e0e66036f082eaaee3c0e5e5183";
    public static final String AUTH_TOKEN = "ef2029565c83e28efa8b2fc3648b8c1d";

    @PostMapping("/send-sms")
    public String sendSms(@RequestParam String toPhoneNumber, @RequestParam String message) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message smsMessage = Message.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber("+16204041493"), message).create();

        return "SMS sent successfully: " + smsMessage.getSid();
    }

}
