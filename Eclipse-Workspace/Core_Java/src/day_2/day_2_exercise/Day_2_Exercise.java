package day_2.day_2_exercise;

import java.util.*;

public class Day_2_Exercise {

	public static void eggGross() {
		int n, grossTotal, dozenTotal, remainTotal;
		int grossNumber = 144;
		int dozenNumber = 12;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number Of Eggs: ");
		n = sc.nextInt();
		grossTotal = n / grossNumber;
		dozenTotal = (n % grossNumber) / dozenNumber;
		remainTotal = n - (dozenTotal * dozenNumber) - (grossTotal * grossNumber);
		System.out.println("Gross Total: " + grossTotal);
		System.out.println("Dozen Total: " + dozenTotal);
		System.out.println("Remaining Total: " + remainTotal);
		sc.close();
	}

	public static void StringExercise() {
		String question = new String("The quick brown fox jumps over the lazy dog");
		System.out.println("1. " + question.charAt(12));
		System.out.println("2. " + question.contains("is"));
		System.out.println("3. " + question + " and killed it");
		System.out.println("4. " + question.endsWith("dogs"));
		System.out.println("5. " + question.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("6. " + question.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println("7. " + question.length());
		System.out.println("8. " + question.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("9. " + question.replaceAll("The", "A"));
		String[] arrOfStr = question.split("jumps");
		System.out.print("10. ");
		for (String a : arrOfStr)
			System.out.println(a);
		System.out.println("11. " + question.substring(16, 19) + "\t" + question.substring(40, 43));
		System.out.println("12. " + question.toLowerCase());
		System.out.println("13. " + question.toUpperCase());
		System.out.println("14. " + question.indexOf('a'));
		System.out.println("15. " + question.lastIndexOf('e'));
	}

	public static void main(String[] args) {
		eggGross();
		StringExercise();

	}

}
