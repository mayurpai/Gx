package com.company.model;

public class Customer {

	private int customerID;
	private String customerName;
	private String customerAddress;

	public Customer(int customerID, String customerName, String customerAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
