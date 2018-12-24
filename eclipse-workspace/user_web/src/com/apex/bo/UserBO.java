package com.apex.bo;

import com.apex.vo.User;

public interface UserBO {
	
	public void addUser(User user);
	public void getUser(int id);
	public void updateUser(User user);
	public void deleteUser(int id);

	

}