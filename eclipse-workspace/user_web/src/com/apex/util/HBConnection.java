package com.apex.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HBConnection {
	
	@Autowired
	public SessionFactory sessionFactory;
	public Session getSession() {
		Session session = null;
		try {
			System.out.println("Sessiomfactory:"+sessionFactory);
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

}
