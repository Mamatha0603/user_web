package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.bo.ContactInfoBO;
import com.apex.vo.ContactInfoBean;
@Controller
@SessionAttributes
public class ContactInfoController {

	@Autowired
	ContactInfoBO contactInfoBO;

	@RequestMapping("/contactform.do")
	public String displayContactPage(@ModelAttribute ContactInfoBean contactInfoBean) {
		
		System.out.println("testing");
		
		return "contactInfo";
	}

	@RequestMapping("/addcontact.do")
	public String addContact(ContactInfoBean contactInfoBean) {
		System.out.println("in controller..");
		System.out.println("Adress:"+contactInfoBean.getAddress());
		
		contactInfoBO.addContactInfo(contactInfoBean);

		return "contactinfosuccess";
	}

}
