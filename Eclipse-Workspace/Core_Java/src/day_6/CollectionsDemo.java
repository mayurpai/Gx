package day_6;

import java.util.*;

public class CollectionsDemo {
	// Collection Is A Framework Which Reduces Programming Efforts, Consists Of
	// cont...Various Useful Interfaces And
	// cont...Classes
	// Easy Learning Curve
	// Available In java.util

	// Collection
	// / \
	// (Interfaces) List: Duplicates Allowed | Set: Duplicates Not Allowed
	// / \
	// (Classes) ArrayList: Non-Synchronized, LinkedList, Vector: Synchronized |
	// HashSet (No Order Is
	// Guaranteed) , TreeSet (Sorted Order), LinkedHashedSet (As It Is)

	public CollectionsDemo() {
		List<String> names = new ArrayList<String>();
		names.add("Mayur");
		names.add("Kavya");
		names.add("Nagendra");
		names.add("Aman");
		System.out.println(names);
		names.add(2, "Kiran");
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
		names.remove("Aman");
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println("names Size: " + names.size());
		System.out.println("names Contains Mayur: " + names.contains("Mayur"));
		System.out.println("names Is Empty? " + names.isEmpty());
//		names.clear();
		System.out.println("names Is Empty? " + names.isEmpty());
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp);
		}
		Collections.sort(names);
		System.out.println("Mayur Is At Index: " + Collections.binarySearch(names, "Mayur"));
		System.out.println("Random Is At Index: " + Collections.binarySearch(names, "Random"));
		System.out.println(names);
	}

	public static void main(String[] args) {
		new CollectionsDemo();
	}

}
