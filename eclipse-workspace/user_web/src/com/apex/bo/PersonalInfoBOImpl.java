package com.apex.bo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.dao.PersonalInfoDAO;
import com.apex.vo.PersonalInfoBean;

@Service
public class PersonalInfoBOImpl implements PersonalInfoBO {
	@Autowired
	PersonalInfoDAO personalInfoDAO;

	@Override
	public void addPersonalInfo(PersonalInfoBean personalInfoBean) throws SQLException {
		System.out.println("Entry: addPersonalInfo()");
		personalInfoDAO.addPersonalInfo(personalInfoBean);
		

	}

}
