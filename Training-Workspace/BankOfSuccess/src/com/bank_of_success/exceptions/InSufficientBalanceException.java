package com.bank_of_success.exceptions;

@SuppressWarnings("serial")
public class InSufficientBalanceException extends ApplicationException {

	public InSufficientBalanceException(String errorMessage) {
		super(errorMessage);
	}
}
