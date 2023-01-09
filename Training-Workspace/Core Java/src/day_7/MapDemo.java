package day_7;

import java.util.*;

// Map Is An Interface With Key-Value Pairs
// It Doesn't Have Add Method
// Key Cannot Be Duplicate
public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> employeesOne = new TreeMap<String, Integer>();
		employeesOne.put("Mayur", 10000);
		employeesOne.put("Kavya", 9000);
		employeesOne.put("Sriraksha", 9500);
		employeesOne.put("Nagendra", 8000);
		employeesOne.put("Aman", 8500);
		Map<String, Integer> employeesTwo = new HashMap<String, Integer>();
		employeesTwo.put("Ankita", 10000);
		employeesTwo.put("Meghana", 9000);
		employeesTwo.put("Kiran", 9500);
		employeesTwo.put("Samarth", 8000);
		employeesTwo.put("Shubham", 8500);
		Map<String, Integer> employeesThree = new LinkedHashMap<String, Integer>();
		employeesThree.put("Random", 10000);
		employeesThree.put("Vaishnavi", 9000);
		employeesThree.put("Shainitha", 9500);
		employeesThree.put("Jessica", 8000);
		employeesThree.put("Deekshitha", 8500);
		System.out.print("TreeMap: ");
		System.out.println(employeesOne);
		System.out.print("HashMap: ");
		System.out.println(employeesTwo);
		System.out.print("LinkedHashMap: ");
		System.out.println(employeesThree);
		System.out.println("Other Operations: ");
		System.out.println("Key [Mayur]: Value [" + employeesOne.get("Mayur") + "]");
		System.out.println("employeesTwo Value: " + employeesTwo.values());
		System.out.println("employeesThree Key: " + employeesThree.keySet());
		System.out.println("emplyeesThree Conatins Key [Mayur]: " + employeesOne.containsKey("Mayur"));
		System.out.println("emplyeesThree Conatins Value [100] : " + employeesThree.containsValue(100));
		System.out.println("employeesTwo isEmpty: " + employeesThree.isEmpty());
		System.out.println("employeesOne: " + employeesOne.entrySet());
		employeesThree.remove("Random");
		System.out.println("employeesThree Removed Random: " + employeesThree.entrySet());
	}

}
