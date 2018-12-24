package com.apex.bo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.dao.Userdao;
import com.apex.vo.User;
@Service
public class UserBOImpl implements UserBO {
     @Autowired
	Userdao userdao;
	@Override
	public void addUser(User user) {
	
		System.out.println("Enttry: UserBOImpl:addUser()");
		try {
			userdao.addUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exit: UserBOImpl:addUser()");
			
	}


	@Override
	public void getUser(int id) {
		System.out.println("Enttry: UserBOImpl:getUser()");
		System.out.println("Exit: UserBOImpl:getUser()");
		
	}

	
	@Override
	public void updateUser(User user) {
		System.out.println("Enttry: UserBOImpl:updateUser()");
		System.out.println("Exit: UserBOImpl:updateUser()");
		
	}

	@Override
	public void deleteUser(int id) {
		System.out.println("Enttry: UserBOImpl:deleteUser()");
		System.out.println("Exit: UserBOImpl:deleteUser()");
		
	}

	

}
