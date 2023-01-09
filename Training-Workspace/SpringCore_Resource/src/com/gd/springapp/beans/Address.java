package com.gd.springapp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Address {

	private int doorNo;
	private String streetName;
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
