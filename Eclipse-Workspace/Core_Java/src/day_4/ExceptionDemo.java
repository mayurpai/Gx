package day_4;

import java.util.*;

public class ExceptionDemo {
	int numberOne, numberTwo, result;
	int marks[] = new int[5];
	String name;
	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.print("Enter First Number: ");
		numberOne = sc.nextInt();
		System.out.print("Enter Second Number: ");
		numberTwo = sc.nextInt();
		try {
			result = numberOne / numberTwo;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(result);
		}
	}

	public void nameDisplay() {
		try {
			name.length();
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void marksDisplay() {
		try {
			System.out.println(marks[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		ed.display();
		ed.marksDisplay();
		ed.nameDisplay();

		System.out.println("Thanks For Running Me! :)");
	}

}
