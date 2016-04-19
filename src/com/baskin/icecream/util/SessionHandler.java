package com.baskin.icecream.util;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.baskin.model.User;

@Component("sessionHandler")
public class SessionHandler implements WebConstants {

	public static void setUserAttribute(HttpSession session, User user) {
		session.setAttribute(USER, user);
	}
	
	public static void resetUserAttribute(HttpSession session) {
		session.removeAttribute(USER);
	}
	
	public static User getUserAttribute(HttpSession session) {
		return (User) session.getAttribute(USER);
	}
}
