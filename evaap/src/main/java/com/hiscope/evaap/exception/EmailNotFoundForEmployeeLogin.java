package com.hiscope.evaap.exception;

public class EmailNotFoundForEmployeeLogin extends RuntimeException {

	private String message = "Email Not Found For The User";
	public EmailNotFoundForEmployeeLogin(String message) {
		super();
		this.message = message;
	}
}
