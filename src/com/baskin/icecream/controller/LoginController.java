package com.baskin.icecream.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.baskin.exception.BaskinException;
import com.baskin.icecream.service.LoginService;
import com.baskin.icecream.util.SessionHandler;
import com.baskin.icecream.util.Utility;
import com.baskin.model.User;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public @ResponseBody String login(HttpServletRequest request) {
		String token = request.getHeader("authorization");
		User user = Utility.getUser(token);
		if(loginService.authenticateUser(user)) {
			SessionHandler.setUserAttribute(request.getSession(), user);
			return "success";
		} else {
			throw new BaskinException("Invalid Username/password.");
		}
	}
	/*
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody User getUser(HttpServletRequest request) {
		User user = new User();
		user.setUsername("Abhishek"); 
		user.setPassword("abhishek");

	return user;
	}*/
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public @ResponseBody String logout(HttpServletRequest request) {
		SessionHandler.resetUserAttribute(request.getSession());
		return "success";
	}
	
	@RequestMapping(value="/userDetails", method=RequestMethod.GET)
	public @ResponseBody User getUserDetails(HttpServletRequest request) {
		User user = (User) SessionHandler.getUserAttribute(request.getSession());
		return user;
	}
}
