package com.company.model;

import java.util.HashMap;

public class RegCustomer extends Customer {

	HashMap<Integer, Customer> regCustomerMap = new HashMap<Integer, Customer>();

	private double splDiscount;

	public double getSplDiscount() {
		return splDiscount;
	}

	public void setSplDiscount(double splDiscount) {
		this.splDiscount = splDiscount;
	}

	public RegCustomer() {

	}

	public boolean checkRegCustomer(int id) {
		Customer customerOne = new Customer(1, "Mayur", "Bangalore");
		Customer customerTwo = new Customer(2, "Kavya", "Bangalore");
		Customer customerThree = new Customer(3, "Nagendra", "Bangalore");
		Customer customerFour = new Customer(4, "Sriraksha", "Mangalore");
		regCustomerMap.put(1, customerOne);
		regCustomerMap.put(2, customerTwo);
//		regCustomerMap.put(3, customerThree);
//		regCustomerMap.put(4, customerFour);
//		System.out.println(regCustomer.toString());
		if (regCustomerMap.containsKey(id)) {
			return true;
		} else {
			return false;
		}
	}

	public RegCustomer(int customerID, String customerName, String customerAddress, double splDiscount) {
		super(customerID, customerName, customerAddress);
		this.splDiscount = splDiscount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
