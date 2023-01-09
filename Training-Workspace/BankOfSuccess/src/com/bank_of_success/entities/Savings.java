package com.bank_of_success.entities;

import java.time.LocalDate;

public class Savings extends Account  {

	public LocalDate dateOfBirth;
	public String gender;
	public String phoneNo;

	public Savings(long accNo, String name, int pinNumber, float balance, boolean isActive, LocalDate activatedDate,
			LocalDate closedDate, Privilege privilege, LocalDate dateOfBirth, String gender, String phoneNo,
			String accountType) {
		super(accNo, name, pinNumber, balance, isActive, activatedDate, closedDate, privilege, accountType);
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNo = phoneNo;
	}

	

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Savings [dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", phoneNo=" + phoneNo + ", accNo="
				+ accNo + ", name=" + name + ", pinNumber=" + pinNumber + ", balance=" + balance + ", isActive="
				+ isActive + ", activatedDate=" + activatedDate + ", closedDate=" + closedDate + ", privilege="
				+ privilege + ", accountType=" + accountType + "]";
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Savings() {
		// TODO Auto-generated constructor stub
	}

}
