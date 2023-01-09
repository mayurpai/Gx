package com.bank_of_success_app.model;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name = "Savings_Account")
@PrimaryKeyJoinColumn(name = "ID")
public class Savings extends AccountManager {

	static String dateOfBirth;
	static String gender;
	static int phoneNumber;

	public static String getDateOfBirth() {
		return dateOfBirth;
	}

	public static void setDateOfBirth(String dateOfBirth) {
		Savings.dateOfBirth = dateOfBirth;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Savings.gender = gender;
	}

	public static int getPhoneNumber() {
		return phoneNumber;
	}

	public static void setPhoneNumber(int phoneNumber) {
		Savings.phoneNumber = phoneNumber;
	}

	public boolean ageValidation() {
		LocalDate l = LocalDate.parse(getDateOfBirth());
		Period diff = Period.between(l, LocalDate.now());
		if (diff.getYears() < 18) {
			System.out.println("Throws Exception");
			return false;
		} else {
			return true;
		}

	}

	public boolean isActiveStatus() {
		if (!isActive)
			isActive = true;
//		isActive = false;
		return isActive;
	}

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void open() {
		ageValidation();
		isActiveStatus();
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
