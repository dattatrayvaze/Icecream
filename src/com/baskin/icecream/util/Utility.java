package com.baskin.icecream.util;

import java.nio.charset.StandardCharsets;

import javax.xml.bind.DatatypeConverter;

import org.apache.log4j.Logger;

import com.baskin.exception.BaskinException;
import com.baskin.model.User;

public class Utility {
//Basic c2JzX2FwaW1lbmFibGVyQHVzLmlibS5jb206QVBJTTAwMDI=
	public static Logger logger =  Logger.getLogger(Utility.class);
	public static User getUser(String authorizationHeader) {
		logger.info("Utility.getUser starts");
		logger.info(authorizationHeader);
		User user = new User();
		try {
			String decoded  = new String (DatatypeConverter.parseBase64Binary(authorizationHeader.split(" ")[1]),StandardCharsets.UTF_8);
			String[] userDetails = decoded.split(":");
			user.setUsername(userDetails[0]);
			user.setPassword(userDetails[1]);
		} catch(Exception e) {
			logger.error(e.getLocalizedMessage());
			logger.error(e.getStackTrace());
			throw new BaskinException("Invalid UserName/Password.");
		}
		return user;
	}
}
