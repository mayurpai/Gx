package com.bank_of_success.entities;

public class AccountManagerFactory {

	public static IAccountManager create() {
		IAccountManager iaccountManager = new AccountManager();
		return iaccountManager;

	}

	private AccountManagerFactory() {
		// TODO Auto-generated constructor stub
	}

}
