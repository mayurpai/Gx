package com.java.collections;

import java.lang.annotation.Native;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> naturalNumbers = new LinkedList<Integer>();

		for (int i = 1; i <= 5; i++) {
			naturalNumbers.add(i);
		}
		System.out.println(naturalNumbers);

		naturalNumbers.add(1, 9);

		naturalNumbers.remove(3);

		System.out.println(naturalNumbers);

		System.out.println(naturalNumbers.contains(2));

		naturalNumbers.removeLast();

		for (Iterator iterator = naturalNumbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		naturalNumbers.removeFirst();

		for (int i = 0; i < naturalNumbers.size(); i++) {
			System.out.println(naturalNumbers.get(i));
		}

		naturalNumbers.addLast(6);
		naturalNumbers.addFirst(0);

		for (Integer integer : naturalNumbers) {
			System.out.println(integer);
		}

		naturalNumbers.clear();

		System.out.println(naturalNumbers);
	}

}
