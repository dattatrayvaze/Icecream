package com.baskin.exception;

public class BaskinException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message; 
	public BaskinException () {}
	
	public BaskinException (String message) {
		this.message =  message;
	}

	public String getMessage() {
		return message;
	}
}
