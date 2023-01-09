package day_7;

import java.util.Comparator;

public class ProductIDComparatorAscendingDemo implements Comparator<ProductComparableDemo> {

	public static void main(String[] args) {
		
	}

	@Override
	public int compare(ProductComparableDemo objectOne, ProductComparableDemo objectTwo) {
		if (objectOne.getProductID() < objectTwo.getProductID())
			return -1;
		else
			return 0;
	}

}
