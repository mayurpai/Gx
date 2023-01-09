package day_6;

import java.util.*;

public class HashSetDemo {

	public HashSetDemo() {
		Set<String> names = new HashSet<String>();
		names.add("Mayur");
		names.add("Kavya");
		names.add("Nagendra");
		names.add("Aman");
		System.out.println(names);
//		names.add(2, "Kiran"); // Can't Add At Particular Index In Set
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
		names.remove("Aman");
		System.out.println(names);
//		System.out.println(names.get(0)); // Get Doesn't Work In Set
		System.out.println("names Size: " + names.size());
		System.out.println("names Contains Mayur: " + names.contains("Mayur"));
		System.out.println("names Is Empty? " + names.isEmpty());
//		names.clear();
		System.out.println("names Is Empty? " + names.isEmpty());
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		new HashSetDemo();
	}

}
