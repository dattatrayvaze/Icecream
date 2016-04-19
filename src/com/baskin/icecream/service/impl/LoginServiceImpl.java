package com.baskin.icecream.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baskin.icecream.dao.UserDAO;
import com.baskin.icecream.service.LoginService;
import com.baskin.model.User;
@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean authenticateUser(User user) {
		User tempUser = userDAO.getUser(user.getUsername());
		if(tempUser != null && tempUser.getPassword().equals(user.getPassword())) {
			return true;
		} else 
			return false;
	}

}
