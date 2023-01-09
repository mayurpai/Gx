// Write a Java program for Data structure of Stack – using LinkedList

import java.util.*;

class NodeCreation {
	int data;
	NodeCreation next;

	NodeCreation(int data) {
		this.data = data;
		this.next = null;
	}
}

public class stackUsingLinkedList {
	int maxSize = 5;
	int top = -1;
	NodeCreation head;

	NodeCreation insertFront(int key, NodeCreation head) {
		NodeCreation tempNode = new NodeCreation(key);

		if (head == null)
			head = tempNode;
		else if (top >= maxSize - 1) {
			System.out.println("Stack Overflow!");
		} else {
			tempNode.next = head;
			head = tempNode;
		}
		++top;
		return head;
	}

	NodeCreation deleteFront(NodeCreation head) {
		if (head == null) {
			System.out.println("Stack Underflow!");
		} else {
			NodeCreation tempNode = head;
			head = tempNode.next;
		}
		return head;
	}

	void display(NodeCreation head) {
		NodeCreation tempNode = head;
		if (tempNode == null) {
			System.out.println("Stack Underflow!");
		}
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}

	public static void main(String args[]) {
		stackUsingLinkedList l = new stackUsingLinkedList();
		l.head = null;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n********* MENU *********");
			System.out.println("\n1.Insert Front");
			System.out.println("\n2.Delete Front");
			System.out.println("\n3.Display");
			System.out.println("\n4.Exit");
			System.out.println("\nEnter Your Choice : ");
			int n = in.nextInt();
			switch (n) {
			case 1:
				System.out.println("\nEnter The Value :");
				l.head = l.insertFront(in.nextInt(), l.head);
				break;
			case 2:
				l.head = l.deleteFront(l.head);
				break;
			case 3:
				l.display(l.head);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("\n Wrong Choice!");
				break;
			}
		} while (true);
	}
}
