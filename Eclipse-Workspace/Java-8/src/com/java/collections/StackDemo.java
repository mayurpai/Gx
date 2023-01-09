package com.java.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> cricketPlayers = new Stack<>();

		cricketPlayers.push("Virat");
		cricketPlayers.push("Dhoni");
		cricketPlayers.push("Rohit");

		System.out.println(cricketPlayers);

		String poppedElement = cricketPlayers.pop();
		System.out.println("Popped Element: " + poppedElement);

		System.out.println(cricketPlayers.capacity());

		System.out.println(cricketPlayers.elementAt(1));

		cricketPlayers.add("Dhawan");
		
		System.out.println(cricketPlayers.get(1));
		
		System.out.println(cricketPlayers.indexOf("Dhoni"));
		
		System.out.println(cricketPlayers.firstElement());
		
		System.out.println(cricketPlayers.lastElement());
		
		System.out.println(cricketPlayers.peek());

		System.out.println(cricketPlayers);

	}

}
