package com.hiscope.evaap.exception;

public class PasswordIncorrectException extends RuntimeException {
	
	private String message = "password Not correct For The User";
	public PasswordIncorrectException(String message) {
		super();
		
		this.message= message;
	}
}
