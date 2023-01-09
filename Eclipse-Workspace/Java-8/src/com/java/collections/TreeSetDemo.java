package com.java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> naturalNumbers = new TreeSet<Integer>();

		for (int i = 5; i >= 1; i--) {
			naturalNumbers.add(i);
		}
		System.out.println(naturalNumbers);

		naturalNumbers.add(1);

		naturalNumbers.remove(3);

		System.out.println(naturalNumbers);

		System.out.println(naturalNumbers.contains(2));

		for (Iterator iterator = naturalNumbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		for (Integer integer : naturalNumbers) {
			System.out.println(integer);
		}

		naturalNumbers.clear();

		System.out.println(naturalNumbers);
	}

}
