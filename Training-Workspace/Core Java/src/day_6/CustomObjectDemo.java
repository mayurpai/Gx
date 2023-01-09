package day_6;

import java.util.*;

import day_4.Product;

public class CustomObjectDemo {

	public CustomObjectDemo() {
		List<Product> products = new ArrayList<Product>();
		Product productOne = new Product(1, "Mouse", 400, 300);
		Product productTwo = new Product(2, "Keyboard", 500, 900);
		Product productThree = new Product(3, "Joystick", 100, 1200);
		products.add(productOne);
		products.add(productTwo);
		products.add(productThree);
		products.add(new Product(4, "Monitor", 200, 10000));
		System.out.println(products);
		Iterator<Product> iterator = products.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		new CustomObjectDemo();
	}

}
