// Write a Java program to find strings has unique characters using HashTable

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class uniqueCharacterCountHashTable {
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
			if (entry.getValue() == Integer(1))
				System.out.print(entry.getKey() + " ");
		}
	}

	private static Object Integer(int i) {
		return i;
	}

	public static void main(String[] args) {
		System.out.print("Enter The String: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		characterCount(inputString);

	}

}
