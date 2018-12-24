package com.apex.dao;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apex.entity.ContactInfo;
import com.apex.util.HBConnection;
import com.apex.vo.ContactInfoBean;

@Repository
public class ContactInfoDAOImpl implements ContactInfoDAO {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	HBConnection hbConnection;
	
	@Autowired
	SessionFactory sessionFactory;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Transactional
	@Override
	public void addContactInfo(ContactInfoBean contactInfoBean) {
		System.out.println("In conatctInfoDAO method..");
		System.out.println("Session factory:"+sessionFactory);
		
		ContactInfo contactInfo=new ContactInfo(contactInfoBean.getAddress(),
				contactInfoBean.getCity(),contactInfoBean.getState(),contactInfoBean.getCountry(),contactInfoBean.getPhone());

		Session session=hbConnection.getSession();
		System.out.println("session:"+session);
		
		session.save(contactInfo);
		
	}

}
