package com.bank_of_success.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.bank_of_success.exceptions.InSufficientBalanceException;
import com.bank_of_success.exceptions.InvalidAgeException;
import com.bank_of_success.exceptions.RegistrationNumberNotAvailableException;

public class AccountFactory implements IAccountManager {
//	public static List<Account> accounts = new ArrayList<Account>();
//    public static HashMap<Long, Float> balanceGetter = new HashMap<Long, Float>();
	public static HashMap<Long, Account> accountList = new HashMap<Long, Account>();

	public static HashMap<Long, Account> getAccountList() {
		return accountList;
	}

	public static void setAccountList(HashMap<Long, Account> accountList) {
		AccountFactory.accountList = accountList;
	}

	public static HashMap<Long, Float> accountBalance = new HashMap<Long, Float>();
	static AccountFactory accountFactory = new AccountFactory();
	private static Scanner sc = new Scanner(System.in);
	public static Account accountObj;
	public static long accNo;
	public static String name;
	public static int pinNumber;
	public static float balance;
	public static boolean isActive;
	public static LocalDate activatedDate;
	public static LocalDate closedDate;
	public static Privilege privilege;
	public static String dateOfBirth;
	public static LocalDate dob;
	public static String registrationNumber;

	public static Account create(String type) throws InvalidAgeException, RegistrationNumberNotAvailableException {
		Account account;
		if (!type.equals("SAVING")) {
			accountCreator();
			System.out.print("Enter Company Name: ");
			String companyName = sc.next();
			System.out.print("Enter Company Website: ");
			String companyWebsite = sc.next();
			System.out.print("Enter Registration Number: ");
			registrationNumber = sc.next();
			account = new Current(accNo, name, pinNumber, balance, isActive, activatedDate, closedDate, privilege,
					companyName, companyWebsite, registrationNumber, type);
			accountFactory.open(account);
			accountList.put(accNo, account);
			setAccountList(accountList);
			System.out.println(accountList);
			accountBalance.put(accNo, balance);
			System.out.println(accountBalance);

		} else {
			accountCreator();
			System.out.print("Enter Date Of Birth: ");
			dateOfBirth = sc.next();
			dob = LocalDate.parse(dateOfBirth);
			System.out.print("Enter Gender:");
			String gender = sc.next();
			System.out.print("Enter Phone Number: ");
			String phoneNumber = sc.next();
			account = new Savings(accNo, name, pinNumber, balance, isActive, activatedDate, closedDate, privilege, dob,
					gender, phoneNumber, type);
			accountFactory.open(account);
			accountList.put(accNo, account);
			setAccountList(accountList);
			System.out.println(accountList);
			accountBalance.put(accNo, balance);
			System.out.println(accountBalance);
		}
		return account;
	}

	public static void accountCreator() {
		System.out.print("Enter Account Number: ");
		accNo = sc.nextLong();
//		accountObj.setAccNo(sc.nextLong());
		System.out.print("Enter Account Holder Name: ");
		name = sc.next();
		System.out.print("Enter Pin Number: ");
//		accountObj.setPinNumber(sc.nextInt());
		pinNumber = sc.nextInt();
		System.out.print("Enter Initial Balance: ");
//		accountObj.setBalance(sc.nextFloat());
		balance = sc.nextFloat();
		System.out.print("Enter Privelege: 1. PREMIUM \t 2. GOLD \t 3. SILVER");
		int privelege = sc.nextInt();
		if (privelege == 1) {
//			accountObj.setPrivilege(Privilege.PREMIUM);
			privilege = Privilege.PREMIUM;
		} else if (privelege == 2) {
//			accountObj.setPrivilege(Privilege.GOLD);
			privilege = Privilege.GOLD;
		} else {
//			accountObj.setPrivilege(Privilege.SILVER);
			privilege = Privilege.SILVER;
		}
		activatedDate = LocalDate.now();
		closedDate = LocalDate.now().plusYears(5);
		isActive = true;
//		accountObj.setActivatedDate(LocalDate.now());
//		accountObj.setClosedDate(LocalDate.now().plusYears(5));
//		accountObj.setActive(true);
	}

	protected AccountFactory() {
		// TODO Auto-generated constructor stub
	}

	public static boolean ageValidation(LocalDate dob) throws InvalidAgeException {
		LocalDate curDate = LocalDate.now();
		if ((dob != null) && (curDate != null)) {
			int diff = Period.between(dob, curDate).getYears();
			if (diff < 18) {
				throw new InvalidAgeException("Age Less Than 18");
			}
		} else {
			return true;
		}
		return true;
	}

	public boolean checkRegistrationNumber() throws RegistrationNumberNotAvailableException {
		System.out.println(registrationNumber);
		if (registrationNumber == null) {
			System.out.println("asasas");
			throw new RegistrationNumberNotAvailableException("Invalid Registration Number");
		} else {
			return true;
		}
	}

	public boolean open(Account account) throws InvalidAgeException, RegistrationNumberNotAvailableException {
		if (account.getAccountType() == "SAVING") {
			System.out.println("if");

			System.out.println(dob);
			if (!ageValidation(dob)) {
				System.out.println("if-if");
				account.setActive(false);
				return false;
			}
			account.isActive = true;
			return true;
		} else {
			System.out.println("wqer");
			if (!checkRegistrationNumber()) {
				System.out.println("else");
				account.setActive(false);
			}
			account.setActive(true);
		}
		return false;
	}

	@Override
	public boolean close(Account account) {
		account.setActive(false);
		System.out.println("Account Closed");
		return false;
	}

	@Override
	public boolean withdraw(int pinNumber, double amount, Account account) throws InSufficientBalanceException {
		if (account.isActive == true) {
			System.out.println("Available Balance: " + account.getBalance());
			if (amount > account.getBalance()) {
				throw new InSufficientBalanceException("Amount Withdrawing Should Be Less Than The Existing Balance!");
			} else if (amount <= account.getBalance()) {
				account.setBalance((float) (account.getBalance() - amount));
				System.out.println("Available Balance: " + account.getBalance());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount, Account account) {
		if (account.isActive == true) {
			account.setBalance((float) (account.getBalance() + amount));
			System.out.println("Available Balance: " + account.getBalance());
		}
		return false;
	}

	@Override
	public boolean transfer(TransferInfo transferInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
