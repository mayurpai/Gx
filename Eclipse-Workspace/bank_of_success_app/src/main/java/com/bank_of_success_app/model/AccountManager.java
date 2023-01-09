package com.bank_of_success_app.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Table(name = "AccountManager")
@Data
//@Entity
@Component
abstract class AccountManager {

	@Id
	@Column(name = "ID")
	private int id;
	static int accountID;
	static int accountNumber;
	static String name;
	static int pinNumber;
	static double balance;

	static enum privilge {
		PREMIUM, GOLD, SILVER
	};

	static boolean isActive;
	static String activatedDate;
	static String closedDate;

	protected abstract void open();

	protected abstract void close();

	protected abstract void withdraw();

	protected abstract void deposit();

	public AccountManager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}

}
