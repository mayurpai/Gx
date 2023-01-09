package com.bank_of_success.exceptions;

@SuppressWarnings("serial")
public class AccountAlreadyClosedException extends ApplicationException {

	public AccountAlreadyClosedException(String errorMessage) {
		super(errorMessage);
	}

}
