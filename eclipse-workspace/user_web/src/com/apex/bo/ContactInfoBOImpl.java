package com.apex.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.apex.dao.ContactInfoDAO;
import com.apex.vo.ContactInfoBean;

@Service
public class ContactInfoBOImpl implements ContactInfoBO {
	
	@Autowired
	ContactInfoDAO contactInfoDAO;
	
	
	@Autowired
	private MailSender mailSender;

	@Override
	public void addContactInfo(ContactInfoBean contactInfoBean) {
		
		// send an email 
		
		contactInfoDAO.addContactInfo(contactInfoBean);
		
		
		try {
			//System.out.println("message:"+message);
			
			SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo("laxmiraj.p@gmail.com"); 
	        message.setSubject("testing"); 
	        message.setText("laxmiraj");
	       //System.out.println("message:"+message.);
			
			mailSender.send(message);
			System.out.println("message sent successfully..");
			
			
			
			
		} catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}


}
