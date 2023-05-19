package com.FYP.shramik1.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FYP.shramik1.Admin;
import com.FYP.shramik1.User;
import com.FYP.shramik1.Worker;


@Service
public class AuthenticationService {
	
	@Autowired
	LoginService service;

	public boolean authenticate(User user) {
		boolean ValidName=false;
		boolean ValidPass=false;
		if(service.findByName(user.getUserName()) && service.findByPass(user.getPassword()))
		{
			ValidPass=true;
			ValidName=true;
		}
		return ValidName && ValidPass;
	}

	public boolean authenticateAdmin(Admin admin) { 
		boolean ValidName=false;
		boolean ValidPass=false;
		if(service.findByNameAdmin(admin.getUserName()) && service.findByPassAdmin(admin.getPassword()))
		{
			ValidPass=true;
			ValidName=true;
		}
		return ValidName && ValidPass;
	}

	

}
