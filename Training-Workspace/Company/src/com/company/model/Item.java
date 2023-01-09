package com.company.model;

public class Item {

	private String desc;
	private double rate;

	@Override
	public String toString() {
		return "Item. " + desc + " - Price: " + rate + "\n";
	}

	public Item(String desc, double rate) {
		super();
		this.desc = desc;
		this.rate = rate;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
