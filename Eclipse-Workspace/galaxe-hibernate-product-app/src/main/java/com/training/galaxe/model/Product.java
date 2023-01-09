package com.training.galaxe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Model Class - POJO (Plain Old Java Objects)
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@Column(name = "Product_ID")
//	(name = "Product ID") => Optional
	private int productID;

	@Column(name = "Product_Name")
	private String productName;

	@Column(name = "Quantity_On_Hand")
	private int quantityOnHand;

	@Column(name = "Price")
	private int price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductID() {
		return productID;
	}

	@Override
	public String toString() {
		return "\n Product [productID=" + productID + ", productName=" + productName + ", quantityOnHand="
				+ quantityOnHand + ", price=" + price + "]";
	}

	public Product(int productID, String productName, int quantityOnHand, int price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("Product");
	}

}
