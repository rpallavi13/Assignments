package com.training.exception;

public class MyCustomException extends Exception {

	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println(super.getMessage());
		return ("There is an Exception "+super.getMessage());
	}

}
