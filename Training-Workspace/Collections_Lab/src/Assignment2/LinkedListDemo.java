package Assignment2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;

public class LinkedListDemo {
	boolean flag = true;
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	LinkedList<Integer> list2 = new LinkedList<Integer>();
	LinkedList<Integer> resultlist = new LinkedList<Integer>();

	public LinkedListDemo() {

	}

	public void createList1() {
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
	}

	public void createList2() {
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
//		list2.add(5);
	}

	public boolean checkList() {
		if (list1.size() != list2.size())
			return false;
		else
			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i) != list2.get(i))
					flag = false;
			}
		return flag;
	}

	public void mergelist() {
		int i;

		for (i = 0; i < list1.size(); i++) {
			resultlist.add(list1.get(i));
		}
		for (int j = 0; j < list2.size(); j++) {
			resultlist.add(list2.get(j));

		}

	}

	public void displaylist(boolean flag) {
		ListIterator itr;
		if (flag) {
			System.out.println(list1.toString());
			System.out.println(list2.toString());
		} else {
//			 itr = (ListIterator) resultlist.iterator();
//			 while(itr.hasNext()) {
//				 System.out.println(itr.next());
//			 }
			System.out.println(resultlist);
		}
	}

}
