package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.bo.UserBO;
import com.apex.vo.User;
@Controller
@SessionAttributes
public class UserController {
	
	@Autowired
	UserBO userBO;
	
	
	@RequestMapping("/user")
	public String displayEntryUser(@ModelAttribute User user) {
		return "user";
		
	}
	
	@RequestMapping("/adduser")
	public String processAddUser(@ModelAttribute User user) {
		//step1
		System.out.println("Entering :UserController:processAddUser()");
		
		
		//step2
		if(user.getFirstName()!=null && !user.getFirstName().isEmpty())
		{
		userBO.addUser(user);
		}
		
		//step3
		System.out.println("Exiting :UserController:processAddUser()");
		
		
		return "usersuccess";
		
	}

}
