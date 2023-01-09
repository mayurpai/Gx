package day_7;

import java.util.*;

public class ComparableComparatorDemo {

	public ComparableComparatorDemo() {
		List<ProductComparableDemo> products = new ArrayList<ProductComparableDemo>();
		ProductComparableDemo productOne = new ProductComparableDemo(1, "Keyboard", 400, 700);
		ProductComparableDemo productTwo = new ProductComparableDemo(2, "Joystick", 500, 1200);
		ProductComparableDemo productThree = new ProductComparableDemo(3, "Monitor", 100, 7000);
		products.add(productThree);
		products.add(new ProductComparableDemo(4, "Mouse", 200, 300));
		products.add(productOne);
		products.add(productTwo);
		System.out.println("Sorting Based On quantityOnHand Ascending");
		Collections.sort(products);
		Iterator<ProductComparableDemo> iteratorOne = products.iterator();
		while (iteratorOne.hasNext()) {
			System.out.println(iteratorOne.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On price Descending");
		Collections.sort(products, new PriceComparatorDescendingDemo());
		Iterator<ProductComparableDemo> iteratorTwo = products.iterator();
		while (iteratorTwo.hasNext()) {
			System.out.println(iteratorTwo.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On productID Ascending");
		Collections.sort(products, new ProductIDComparatorAscendingDemo());
		Iterator<ProductComparableDemo> iteratorThree = products.iterator();
		while (iteratorThree.hasNext()) {
			System.out.println(iteratorThree.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On productName Ascending");
		Collections.sort(products, new ProductNameComparatorAscendingDemo());
		Iterator<ProductComparableDemo> iteratorFour = products.iterator();
		while (iteratorFour.hasNext()) {
			System.out.println(iteratorFour.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On price Ascending");
		Collections.sort(products, new PriceComparatorAscendingDemo());
		Iterator<ProductComparableDemo> iteratorFive = products.iterator();
		while (iteratorFive.hasNext()) {
			System.out.println(iteratorFive.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On productID Descending");
		Collections.sort(products, new Comparator<ProductComparableDemo>() {

			@Override
			public int compare(ProductComparableDemo objectOne, ProductComparableDemo objectTwo) {
				if (objectOne.getProductID() < objectTwo.getProductID())
					return 0;
				else
					return -1;
			}

		});
		Iterator<ProductComparableDemo> iteratorSix = products.iterator();
		while (iteratorSix.hasNext()) {
			System.out.println(iteratorSix.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On productName Descending");
		Collections.sort(products, new Comparator<ProductComparableDemo>() {

			@Override
			public int compare(ProductComparableDemo objectOne, ProductComparableDemo objectTwo) {
				if (objectOne.getProductName().compareTo(objectTwo.getProductName()) > 0)
					return -1;
				else
					return 0;
			}

		});
		Iterator<ProductComparableDemo> iteratorSeven = products.iterator();
		while (iteratorSeven.hasNext()) {
			System.out.println(iteratorSeven.next());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("Sorting Based On quantityOnHand Descending Using Lambda Expression And Anonymous Classes");
		Comparator<ProductComparableDemo> compareQuantityOnHand = (objectOne, objectTwo) -> {
			if (objectOne.getQuantityOnHand() > objectTwo.getQuantityOnHand())
				return -1;
			else
				return 0;
		};
		Collections.sort(products, compareQuantityOnHand);
		Iterator<ProductComparableDemo> iteratorEigth = products.iterator();
		while (iteratorEigth.hasNext()) {
			System.out.println(iteratorEigth.next());
		}

		// Lambda Expressions
		List<String> name = new ArrayList<String>();
		name.add("Mayur");
		name.add("Kavya");
		name.add("Sriraksha");
		name.add("Nagendra");
//		name.forEach(n -> System.out.println(n));
		name.forEach(System.out::println);
	}

	// > & -1 OR < & 0 => Descending
	// < & -1 OR > & 0 => Ascending

	public static void main(String[] args) {
		new ComparableComparatorDemo();
	}

}
