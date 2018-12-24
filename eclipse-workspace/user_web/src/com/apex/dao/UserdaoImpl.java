package com.apex.dao;



import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apex.entity.Usr;
import com.apex.vo.User;

@Repository

public class UserdaoImpl implements Userdao {
	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	   SessionFactory sessionFactory;
	
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	@Transactional
	public void addUser(User user) throws SQLException {
		System.out.println("Enttry: UserdaoImpl:addUser()");
		System.out.println("sessionFactory\t"+sessionFactory);
		
		Connection connection = dataSource.getConnection();
		System.out.println("first one\t"+connection);
		System.out.println("JDBC \t"+jdbcTemplate);
		/* jdbcTemplate.update("INSERT INTO usr (firstname, lastname,middlename) "
		 		+ "VALUES (?,?,?)",user.getFirstName(),
		 		user.getLastName(),user.getMiddleName());*/
		
		Usr usr =new Usr(user.getFirstName(),user.getLastName(),user.getMiddleName());
		Session session = getSession();
		session.save(usr);
		
		
	}

	
	@Override
	public void getUser(int id) {
		System.out.println("Enttry: UserdaoImpl:getUser()");
		System.out.println("Exit: Userdaompl:getUser()");
		
		
	}


	@Override
	public void updateUser(User user) {
		System.out.println("Enttry: UserdaoImpl:updateUser()");
		System.out.println("Exit: Userdaompl:updateUser()");
		
		
	}


	@Override
	public void deleteUser(int id) {
		System.out.println("Enttry: UserdaoImpl:deleteUser()");
		System.out.println("Exit: Userdaompl:deleteUser()");
		
		
	}
	
	
	public Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

}
