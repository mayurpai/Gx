package com.bank_of_success.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import com.bank_of_success.exceptions.InSufficientBalanceException;
import com.bank_of_success.exceptions.InvalidAgeException;
import com.bank_of_success.exceptions.RegistrationNumberNotAvailableException;

public class AccountManager extends AccountFactory {

	private static Scanner sc = new Scanner(System.in);
	Savings savings = new Savings();
	Current current = new Current();
	static AccountManager accountManager = new AccountManager();
	static Account account;

	public static int menuList() {
		System.out.println("1. Create Account");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Deposit Amount");
		System.out.println("4. Close Account");
		System.out.println("5. View All Accounts");
		System.out.println("6. Transfer Amount");
		System.out.println("7. Exit");
		System.out.print("Enter Choice:	");
		return sc.nextInt();
	}

	public AccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
			throws InvalidAgeException, RegistrationNumberNotAvailableException, InSufficientBalanceException {
		boolean flag = true;
		while (flag) {
			switch (menuList()) {
			case 1:
				System.out.println("1. Current Account \t 2. Saving Account");
				int accountChoosen = sc.nextInt();
				if (accountChoosen == 1) {
					account = (Account) AccountFactory.create("CURRENT");
//					accountFactory.open(account);
				} else {
					account = (Account) AccountFactory.create("SAVING");
//					accountFactory.open(account);
				}
				break;
			case 2:
				System.out.print("Enter Pin Number: ");
				int pinNumber = sc.nextInt();
				System.out.print("Enter Amount: ");
				double amount = sc.nextDouble();
				account = (Account) AccountFactory.create("SAVING");
				accountFactory.withdraw(pinNumber, amount, account);
				break;

			case 3:
				System.out.print("Enter Amount: ");
				double amount1 = sc.nextDouble();
				account = (Account) AccountFactory.create("SAVING");
				accountFactory.deposit(amount1, account);
				break;

			case 4:
				account = (Account) AccountFactory.create("SAVING");
				accountFactory.close(account);
				break;
			case 5:
				System.out.println(AccountFactory.getAccountList());
				break;

			case 6:

				break;

			case 7:
				System.exit(0);

			default:
				break;
			}

		}

//		accountManager.open(account);
//		accountManager.withdraw(account.getPinNumber(), 100, account);
//		accountManager.deposit(500, account);
//		accountManager.close(account);
	}

//	public boolean ageValidation() throws InvalidAgeException {
//		savings.setDateOfBirth("2003-12-21");
//		LocalDate l = LocalDate.parse(savings.getDateOfBirth());
//		Period diff = Period.between(l, LocalDate.now());
//		if (diff.getYears() < 18) {
//			throw new InvalidAgeException("Age Less Than 18");
//		} else {
//			return true;
//		}
//	}

	protected boolean CheckAgeValidity(String dateOfBirth) {
		return false;

	}

	protected boolean CheckRegistrationNoValidity(String registrationNo) {
		return false;

	}

	protected boolean ActivateAccount(IAccount account) {
		return false;

	}

	protected boolean CheckFundsAvailability(double amount, IAccount account) {
		return false;

	}

	protected boolean CheckPinNumber(int pinNumber, IAccount account) {
		return false;

	}

}
