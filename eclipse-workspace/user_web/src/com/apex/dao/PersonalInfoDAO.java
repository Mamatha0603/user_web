package com.apex.dao;

import java.sql.SQLException;

import com.apex.vo.PersonalInfoBean;

public interface PersonalInfoDAO {
	public void addPersonalInfo(PersonalInfoBean bean) throws SQLException;
	public PersonalInfoBean getId(int idValue) throws SQLException;
		
	

}
