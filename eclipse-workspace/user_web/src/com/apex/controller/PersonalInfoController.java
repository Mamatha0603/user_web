package com.apex.controller;

import com.apex.bo.PersonalInfoBO;
import com.apex.vo.PersonalInfoBean;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class PersonalInfoController {
	
	@Autowired
	PersonalInfoBO personalInfoBo;
	
	@RequestMapping("/personalform.do")
	public String displayPersonalInfo(@ModelAttribute PersonalInfoBean personalInfoBean) {
		
		System.out.println("test");
		personalInfoBean.setFirstName("Laxmiraj");
		personalInfoBean.setLastName("Prodduturi");
		return "personalinfo";
		
	}
	@RequestMapping("/addPersonalInfo.do")
	public String addPersonalInfo(@ModelAttribute PersonalInfoBean personalInfoBean, @ModelAttribute PersonalInfoBean personalInfoBean1) throws SQLException {
		System.out.println("In Controller method");
		System.out.println(personalInfoBean.getLastName());
		personalInfoBo.addPersonalInfo(personalInfoBean);
		
		return "personalInfoSuccess";
		
	}
	
	

}
