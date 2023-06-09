package com.FYP.shramik1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FYP.shramik1.Admin;
import com.FYP.shramik1.User;
import com.FYP.shramik1.Worker;
import com.FYP.shramik1.Service.AuthenticationService;
import com.FYP.shramik1.Service.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin("*")
public class LoginController {

	@Autowired
	AuthenticationService service;
	
	@Autowired
	LoginService ser;
	
	@GetMapping("/check")
	public List<User> get()
	{
		return ser.find();
	}
	
	
	@PostMapping("/user-login")
	public String Userlogin(@RequestBody User user)
	{
		if(service.authenticate(user))
			return "Logged in Successfully";
		return "Enter Correct Credentials";
		
	}
	
	@PostMapping("user-signup")
	public String Signup(@RequestBody User user)
	{
		if(ser.findByName(user.getUserName()))
				return "User already exists. Please login";
		else
		{
			ser.insert(user);
			return "Signed up successfully";
		}
	}
	
	@PostMapping("/admin-login")
	public String adminlogin(@RequestBody Admin admin)
	{
		if(service.authenticateAdmin(admin))
			return "Logged in Successfully";
		return "Enter Correct Credentials";
		
	}
	
	
}
