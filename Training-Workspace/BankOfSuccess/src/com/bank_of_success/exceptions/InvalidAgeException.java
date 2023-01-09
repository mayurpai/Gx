package com.bank_of_success.exceptions;

@SuppressWarnings("serial")
public class InvalidAgeException extends ApplicationException {

	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}

}
