package com.company.model;

public class OrderedItem extends Order {

	private int qty;

	public int getQty() {
		return qty;
	}

	public OrderedItem(int qty) {
		super();
		this.qty = qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public OrderedItem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
