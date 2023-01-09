package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> naturalNumbers = new ArrayList<Integer>(5);

		for (int i = 1; i <= 5; i++) {
			naturalNumbers.add(i);
		}
		System.out.println(naturalNumbers);

		naturalNumbers.remove(3);

		System.out.println(naturalNumbers);

		System.out.println(naturalNumbers.contains(2));

		for (Iterator iterator = naturalNumbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		for (int i = 0; i < naturalNumbers.size(); i++) {
			System.out.println(naturalNumbers.get(i));
		}

		for (Integer integer : naturalNumbers) {
			System.out.println(integer);
		}

		naturalNumbers.clear();

		System.out.println(naturalNumbers);
	}

}
