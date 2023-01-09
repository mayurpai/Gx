package test;

import java.util.Scanner;

import exceptions.StackOverflowException;
import exceptions.StackUnderflowException;
import utils.Stack;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static void acceptRecord(int[] element) {
		if (element != null) {
			System.out.print("Enter element	:	");
			element[0] = sc.nextInt();
		}
	}

	private static void printRecord(int[] element) {
		if (element != null)
			System.out.println("Popped element is	:	" + element[0]);
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		int[] element = new int[1];

		Stack stack = new Stack(5);
		while ((choice = Program.menuList()) != 0) {
			try {
				switch (choice) {
				case 1:
					Program.acceptRecord(element);
					stack.push(element[0]);
					break;
				case 2:
					element[0] = stack.peek();
					Program.printRecord(element);
					stack.pop();
					break;
				case 3:
					System.out.println(stack.toString());
					break;

				}
			} catch (StackOverflowException | StackUnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
