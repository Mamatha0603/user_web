package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.bo.LoginBO;
import com.apex.vo.LoginBean;

@Controller
public class LoginController {
	
	@Autowired
	LoginBO loginBO;
	
	@Autowired
	private MailSender mailSender;
	
	@RequestMapping("/loginpage.do")
	public String getLoginPage(@ModelAttribute LoginBean loginBean) {
		return "login";
		
	}
	@RequestMapping("/addloginuser.do")
	public String addLoginUser(@ModelAttribute LoginBean loginBean) {
		
		StringBuffer errors=new StringBuffer();
		
		
		if(!loginBean.getRepassword().equals(loginBean.getRepassword())) {
			errors.append("confirmpassword..");
			
			
		}
		loginBO.addLoginUser(loginBean);
		return "loginsuccess";
	}
	
	@RequestMapping("/sendemail.do")
	public String sendEmailUser(@ModelAttribute LoginBean loginBean) {
		
		System.out.println("Inside sendEmailUser controller..");

		try {
			//System.out.println("message:"+message);
			
			SimpleMailMessage message = new SimpleMailMessage(); 
			System.out.println("email:"+loginBean.getEmail());
	        message.setTo(loginBean.getEmail()); 
	        message.setSubject("testing"); 
	        message.setText("laxmiraj");
	       //System.out.println("message:"+message.);
			
			mailSender.send(message);
			System.out.println("message sent successfully..");
			
			
			
			
		} catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return "emailsuccess";
		
	}

}
