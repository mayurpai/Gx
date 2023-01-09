package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> cricketPlayers = new PriorityQueue<>();

		cricketPlayers.add("Virat");
		cricketPlayers.add("Dhoni");
		cricketPlayers.add("Rohit");

		System.out.println(cricketPlayers);

		String removedElement = cricketPlayers.remove();
		System.out.println("Removed Element: " + removedElement);

		System.out.println(cricketPlayers.poll());

		cricketPlayers.add("Dhawan");
		
		System.out.println(cricketPlayers.peek());

		System.out.println(cricketPlayers);

	}

}
