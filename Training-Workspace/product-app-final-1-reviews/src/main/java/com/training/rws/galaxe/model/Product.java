package com.training.rws.galaxe.model;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Product {

	@Id
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int productPrice;

}
