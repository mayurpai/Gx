package com.bank_of_success_app.model;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name = "Current_Account")
@PrimaryKeyJoinColumn(name = "ID")
public class Current extends AccountManager {
	
	static String companyName;
	static String website;
	static int registrationNumber;

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deposit() {
		// TODO Auto-generated method stub
		
	}

}
