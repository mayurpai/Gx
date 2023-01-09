package com.bank_of_success.exceptions;

@SuppressWarnings("serial")
public class RegistrationNumberNotAvailableException extends ApplicationException {

	public RegistrationNumberNotAvailableException(String errorMessage) {
		super(errorMessage);
	}

}
