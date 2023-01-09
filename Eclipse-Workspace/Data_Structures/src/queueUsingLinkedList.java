// Write a Java program for Data structure of Queue - using LinkedList

import java.util.Scanner;

class NodeCreations {
	int data;
	NodeCreations next;

	NodeCreations(int data) {
		this.data = data;
		this.next = null;
	}
}

public class queueUsingLinkedList {

	NodeCreations head;

	NodeCreations insertFronts(int key, NodeCreations head) {
		NodeCreations tempNode = new NodeCreations(key);

		if (head == null)
			head = tempNode;

		else {
			tempNode.next = head;
			head = tempNode;
		}
		return head;
	}

	NodeCreations deleteEnd(NodeCreations head) {
		NodeCreations tempNode = head;
		NodeCreations prevNode = null;
		if (tempNode == null) {
			System.out.println("Nothing To Delete!");
		}
		else if (tempNode.next == null)
			head = tempNode.next;
		else {
			while (tempNode.next != null) {
				prevNode = tempNode;
				tempNode = tempNode.next;
			}
			prevNode.next = null;
		}
		return head;
	}

	void display(NodeCreations head) {
		NodeCreations tempNode = head;
		if (tempNode == null)
			System.out.println("Nothing To Display!");
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}

	public static void main(String args[]) {
		queueUsingLinkedList l = new queueUsingLinkedList();
		l.head = null;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n********* MENU *********");
			System.out.println("\n1.Insert Front");
			System.out.println("\n2.Delete End");
			System.out.println("\n3.Display");
			System.out.println("\n4.Exit");
			System.out.println("\nEnter Your Choice : ");
			int n = in.nextInt();
			switch (n) {
			case 1:
				System.out.println("\nEnter The Value :");
				l.head = l.insertFronts(in.nextInt(), l.head);
				break;
			case 2:
				l.head = l.deleteEnd(l.head);
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