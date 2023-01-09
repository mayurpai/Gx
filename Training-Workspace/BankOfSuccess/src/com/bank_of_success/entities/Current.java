package com.bank_of_success.entities;

import java.time.LocalDate;

public class Current extends Account {

	public String companyName;
	public String website;
	public String registrationNumber;

	

	@Override
	public String toString() {
		return "Current [companyName=" + companyName + ", website=" + website + ", registrationNumber="
				+ registrationNumber + ", accNo=" + accNo + ", name=" + name + ", pinNumber=" + pinNumber + ", balance="
				+ balance + ", isActive=" + isActive + ", activatedDate=" + activatedDate + ", closedDate=" + closedDate
				+ ", privilege=" + privilege + ", accountType=" + accountType + "]";
	}

	public Current(long accNo, String name, int pinNumber, float balance, boolean isActive, LocalDate activatedDate,
			LocalDate closedDate, Privilege privilege, String companyName, String website, String registrationNumber,
			String accountType) {
		super(accNo, name, pinNumber, balance, isActive, activatedDate, closedDate, privilege, accountType);
		this.companyName = companyName;
		this.website = website;
		this.registrationNumber = registrationNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompnayName(String compnayName) {
		this.companyName = compnayName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Current() {
		// TODO Auto-generated constructor stub
	}

}
