package com.bank_of_success.entities;

import com.bank_of_success.exceptions.InSufficientBalanceException;
import com.bank_of_success.exceptions.InvalidAgeException;
import com.bank_of_success.exceptions.RegistrationNumberNotAvailableException;

public interface IAccountManager {
	public boolean open(Account account) throws InvalidAgeException, RegistrationNumberNotAvailableException;

	public boolean close(Account account);

	public boolean withdraw(int pinNumber, double amount, Account account) throws InSufficientBalanceException;

	public boolean deposit(double amount, Account account);

	public boolean transfer(TransferInfo transferInfo);
}
