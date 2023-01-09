package com.bank_of_success.exceptions;

@SuppressWarnings("serial")
public class InvalidPinException extends ApplicationException {

	public InvalidPinException(String errorMessage) {
		super(errorMessage);
	}

}
