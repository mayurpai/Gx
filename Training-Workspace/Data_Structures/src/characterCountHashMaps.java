// Write a Java program to count the characters in a string using HashMap

import java.io.*;
import java.util.*;

class characterCountHashMaps {
	static void characterCount(String inputString) {
		HashMap<Character, Integer> characterCountHashMap = new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (characterCountHashMap.containsKey(c))
				characterCountHashMap.put(c, characterCountHashMap.get(c) + 1);
			else
				characterCountHashMap.put(c, 1);
		}

		for (Map.Entry entry : characterCountHashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter The String: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		characterCount(inputString);
	}
}
