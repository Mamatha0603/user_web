package com.apex.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.dao.LoginDAO;
import com.apex.vo.LoginBean;

@Service
public class LoginBOImpl implements LoginBO {
	@Autowired
	LoginDAO loginDAO;

	@Override
	public void addLoginUser(LoginBean loginBean) {
		System.out.println("Inside addLoginUser BO method..");
		
		loginDAO.addLoginUser(loginBean);
		
	}

}
