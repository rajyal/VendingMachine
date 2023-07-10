package com.vm.exceptions;

public class InvalidIdException extends Exception {
	private String message;
	
	public InvalidIdException(String message) {
		super(message);
		this.message =message;
	}
	
	public String getMessage() {
		return message;
	}

}
