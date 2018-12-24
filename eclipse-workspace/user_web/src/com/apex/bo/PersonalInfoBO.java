package com.apex.bo;

import java.sql.SQLException;

import com.apex.vo.PersonalInfoBean;

public interface PersonalInfoBO {
	
	public void addPersonalInfo(PersonalInfoBean personalInfoBean) throws SQLException;

}
