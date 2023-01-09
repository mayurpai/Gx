package day_7;

import java.util.Comparator;

public class ProductNameComparatorAscendingDemo implements Comparator<ProductComparableDemo> {

	public static void main(String[] args) {

	}

	@Override
	public int compare(ProductComparableDemo objectOne, ProductComparableDemo objectTwo) {
		if (objectOne.getProductName().compareTo(objectTwo.getProductName()) > 0)
			return 0;
		else
			return -1;
	}

}
