package com.bank_of_success.entities;

import java.time.LocalDate;

public abstract class Account implements IAccount {

	public long accNo;
	public String name;
	public int pinNumber;
	public float balance;
	public boolean isActive;
	public LocalDate activatedDate;
	public LocalDate closedDate;
	public Privilege privilege;
	public String accountType;

	public Account(long accNo, String name, int pinNumber, float balance, boolean isActive, LocalDate activatedDate,
			LocalDate closedDate, Privilege privilege, String accountType) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.pinNumber = pinNumber;
		this.balance = balance;
		this.isActive = isActive;
		this.activatedDate = activatedDate;
		this.closedDate = closedDate;
		this.privilege = privilege;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", pinNumber=" + pinNumber + ", balance=" + balance
				+ ", isActive=" + isActive + ", activatedDate=" + activatedDate + ", closedDate=" + closedDate
				+ ", privilege=" + privilege + ", accountType=" + accountType + "]";
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDate getActivatedDate() {
		return activatedDate;
	}

	public void setActivatedDate(LocalDate activationDate) {
		this.activatedDate = activationDate;
	}

	public LocalDate getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(LocalDate closedDate) {
		this.closedDate = closedDate;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

}
