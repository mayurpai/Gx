package com.bank_of_success.exceptions;

@SuppressWarnings("serial")
public class ApplicationException extends Exception {
	
	public ApplicationException(String errorMessage) {
		super(errorMessage);
	}
}
