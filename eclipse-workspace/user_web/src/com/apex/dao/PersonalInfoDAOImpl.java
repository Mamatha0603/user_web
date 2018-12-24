package com.apex.dao;

import java.sql.SQLException;

import javax.persistence.Query;
import javax.sql.DataSource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apex.entity.PersonInfo;
import com.apex.util.HBConnection;
import com.apex.vo.PersonalInfoBean;

@Repository
public class PersonalInfoDAOImpl implements PersonalInfoDAO {
	@Autowired
	DataSource dataSource;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	HBConnection hbConnection;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Transactional
	@Override
	public void addPersonalInfo(PersonalInfoBean personalInfoBean) throws SQLException {
		System.out.println("SessionFactory:" + sessionFactory);

		PersonInfo personInfo = new PersonInfo(personalInfoBean.getFirstName(), personalInfoBean.getLastName(),
				personalInfoBean.getMiddleName());

		Session session = hbConnection.getSession();
		session.save(personInfo);
		

	}
	/*
	 * public Session getSession() { Session session = null; try { session =
	 * sessionFactory.getCurrentSession(); } catch (HibernateException e) { session
	 * = sessionFactory.openSession(); } return session; }
	 */
	@Transactional
	 public  PersonalInfoBean getId(int idValue) {
		 Session session = hbConnection.getSession();
		  String queryString = "from PersonalInfo where id = :id";
		  Query query = (Query) session.createQuery(queryString);
		  ((org.hibernate.Query) query).setInteger("id", idValue);
		  Object queryResult = ((org.hibernate.Query) query).uniqueResult();
		  PersonalInfoBean personalInfoBean = (PersonalInfoBean)queryResult;session.getTransaction().commit();
		  return personalInfoBean;
	
	}

}
