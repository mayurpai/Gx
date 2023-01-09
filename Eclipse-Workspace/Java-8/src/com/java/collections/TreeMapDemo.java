package com.java.collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> markSheet = new TreeMap<>();

		markSheet.put("Mayur", 98);
		markSheet.put("Kavya", 97);
		markSheet.put("Nagendra", 88);

		System.out.println(markSheet.entrySet());

		System.out.println(markSheet.get("Mayur"));

		System.out.println(markSheet.containsKey("Kavya"));

		System.out.println(markSheet.replace("Nagendra", 88, 77));

		System.out.println(markSheet.toString());

		System.out.println(markSheet.values());

		System.out.println(markSheet.keySet());

		markSheet.remove("Nagendra", 77);

		System.out.println(markSheet.size());

		for (Entry<String, Integer> entry : markSheet.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
		}
		
		for (String key : markSheet.keySet()) {
			System.out.println("Key: " + key + " " + "Value: " + markSheet.get(key));
		}

	}

}
