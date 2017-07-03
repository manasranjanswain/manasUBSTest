package com.ubs.opsit.interviews.exceptions;

/**
 * The <code>BusinessException</code> class represents
 * custom exception which used to display error stack trace to 
 * the end user.
 * 
 *
 */


public class BusinessException extends Exception{

	
	private static final long serialVersionUID = 6899032003039507553L;
	private String message;
	
	
	public BusinessException() {
		super();
	}
	
	
	public BusinessException(String message) {
		super(message);
		this.message = message;
	}
	
	
	public BusinessException(String message,Throwable cause) {
		super(message,cause);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}

