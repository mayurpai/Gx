package com.sa.springapp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {

	@Value("304")
	private int doorNo;
	@Value("Deralakatte")
	private String streetName;
	@Value("Mangalore")
	private String city;

	@Override
	public String toString() {
		return ("Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + "]");
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
