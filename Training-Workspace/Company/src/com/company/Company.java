package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.company.model.Customer;
import com.company.model.Item;
import com.company.model.OrderedItem;
import com.company.model.RegCustomer;

public class Company {
	static double totalValue = 0;
	static double overallTotal = 0;
	private static Scanner sc = new Scanner(System.in);
	static List<Item> companyItems = new LinkedList<Item>();
	static RegCustomer regCustomer = new RegCustomer();

	public static int menuList() {
		regCustomer.setSplDiscount(0.15);
		System.out.println("1. Regular Customer");
		System.out.println("2. Non-Regular Customer");
		System.out.println("3. Exit");
		System.out.print("Enter Choice:	");
		return sc.nextInt();
	}

	public double getTotalWorthOfOrdersPlaced(int id) {
		if (id == 1) {
			System.out.println("Total Value: " + totalValue);
			overallTotal += totalValue;
		} else {
			System.out.println("Total Value: " + (totalValue - (totalValue * regCustomer.getSplDiscount())));
			overallTotal += totalValue - (totalValue * regCustomer.getSplDiscount());
		}
		return overallTotal;
	}

	public Company() {
	}

	public static void createItem() {
		Item itemOne = new Item("Pen", 100);
		Item itemTwo = new Item("Pencil", 70);
		Item itemThree = new Item("Eraser", 30);
		Item itemFour = new Item("Scale", 10);
		companyItems.add(itemOne);
		companyItems.add(itemTwo);
		companyItems.add(itemThree);
		companyItems.add(itemFour);
	}

	public static void display() {
		System.out.println(companyItems.toString());
	}

	public static void chooseItem() {
		int itemNumber = 0, itemQuantity;
		OrderedItem orderedItem = new OrderedItem();
		do {
			System.out.println("Note: Enter 0 If Done Shopping");
			System.out.print("Enter Item Number: ");
			try {
				itemNumber = sc.nextInt();
				if (itemNumber != 0) {
					System.out.print("Enter Item Quantity: ");
					itemQuantity = sc.nextInt();
					orderedItem.setQty(itemQuantity);
					totalValue += companyItems.get(itemNumber - 1).getRate() * orderedItem.getQty();
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} while (itemNumber != 0);
	}

	public static void main(String args[]) {
		int count = 1;
		boolean flag = true;
		Company.createItem();
		while (flag) {
			switch (menuList()) {
			case 3:
				System.out.println("Thank You For Visiting!");
				flag = false;
				System.exit(0);
			case 2:
				totalValue = 0;
				System.out.print("Enter Name: ");
				String customerName = sc.next();
				System.out.print("Enter Address: ");
				String customerAddress = sc.next();
				new Customer(count, customerName, customerAddress);
				Company.display();
				Company.chooseItem();
				new Company().getTotalWorthOfOrdersPlaced(1);
				System.out.println("Overall Total: " + overallTotal);
				break;

			case 1:
				totalValue = 0;
				System.out.print("Enter ID: ");
				int customerID = sc.nextInt();
				boolean checker = regCustomer.checkRegCustomer(customerID);
				if (checker) {
//					System.out.print("Enter Name: ");
//					String regularCustomerName = sc.next();
//					System.out.print("Enter Address: ");
//					String regularCustomerAddress = sc.next();
					new RegCustomer(regCustomer.getCustomerID(), regCustomer.getCustomerName(),
							regCustomer.getCustomerAddress(), regCustomer.getSplDiscount());
					Company.display();
					Company.chooseItem();
					new Company().getTotalWorthOfOrdersPlaced(2);
					System.out.println("Overall Total: " + overallTotal);

				} else {
					System.out.println("No Such Customer ID Exists");
				}
				break;

			default:
				break;
			}

		}

	}

}
