package day_7;

import java.util.Comparator;

public class PriceComparatorDescendingDemo implements Comparator<ProductComparableDemo> {

	@Override
	public int compare(ProductComparableDemo objectOne, ProductComparableDemo objectTwo) {
		if (objectOne.getPrice() > objectTwo.getPrice())
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {

	}

}
