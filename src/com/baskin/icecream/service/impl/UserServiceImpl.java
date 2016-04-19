package com.baskin.icecream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baskin.exception.BaskinException;
import com.baskin.icecream.dao.UserDAO;
import com.baskin.icecream.service.UserService;
import com.baskin.model.User;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public void createUser(User user) throws BaskinException {
		userDAO.createUser(user);

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(String username) {
		
		return userDAO.getUser(username);
	}

	@Override
	public List<User> getUsers(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
