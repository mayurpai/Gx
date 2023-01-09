package com.galaxe.target.comparator;

import java.util.Comparator;

import com.galaxe.target.entity.Product;

public class SortByPriceDescending implements Comparator<Product> {

	@Override
	public int compare(Product objectOne, Product objectTwo) {
		if (objectOne.getProductPrice() < objectTwo.getProductPrice())
			return 0;
		else
			return -1;
	}

}
