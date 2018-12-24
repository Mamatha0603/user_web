package com.apex.dao;

import java.sql.SQLException;

import com.apex.vo.User;

public interface Userdao {
	
	public void addUser(User user) throws SQLException;
	public void getUser(int id);
	public void updateUser(User user);
	public void deleteUser(int id);

}