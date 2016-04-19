package com.baskin.icecream.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.baskin.exception.BaskinException;
import com.baskin.icecream.service.UserService;
import com.baskin.model.User;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST )
	@ResponseStatus(value = HttpStatus.OK)
	public void createUser(HttpServletRequest request, @RequestBody User user, HttpServletResponse response) {
		try {
		userService.createUser(user);
		} catch(BaskinException be) {
			response.setStatus(500);
			response.setContentType("application/json");
			try {
				response.getWriter().print(be.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET )
	public @ResponseBody User getUser(HttpServletRequest request) {
		return userService.getUser(request.getParameter("username"));
	}
}
