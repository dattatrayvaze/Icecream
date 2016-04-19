package com.baskin.icecream.service;

import java.util.List;

import com.baskin.model.User;

public interface UserService {

	public void createUser(User user) ;
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
	
	public User getUser(String username);
	
	public List<User> getUsers(String username);
	
	public List<User> getAllUsers();
}
