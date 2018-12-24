package com.apex.dao;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apex.entity.LoginUser;
import com.apex.util.HBConnection;
import com.apex.vo.LoginBean;

@Repository
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	DataSource datasource;

	@Autowired
	HBConnection hbConnection;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Transactional
	public void addLoginUser(LoginBean loginBean) {
		System.out.println("inside LoginDAOImpl method..");
		LoginUser loginUser=new LoginUser(loginBean.getName(),loginBean.getEmail(),
				loginBean.getDob(),loginBean.getPassword());
		
		Session session=hbConnection.getSession();
		session.save(loginUser);
		
		

	}

}
