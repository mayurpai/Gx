package treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Account a1 = new Account(3, "aa", 1000);
		Account a2 = new Account(1, "ab", 2000);
		Account a3 = new Account(2, "ad", 13000);
		Account a4 = new Account(5, "ac", 500);

		System.out.println("Sort by - \n 1.ID   2.Name   3.Balance");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		switch (n) {
		case 1:
			TreeSet<Account> t1 = new TreeSet<Account>(new SortAccountId());
			t1.add(a1);
			t1.add(a2);
			t1.add(a3);
			t1.add(a4);
			for (Account aa : t1) {
				System.out.println(aa.toString());
			}
			break;

		case 2:
			TreeSet<Account> t2 = new TreeSet<Account>(new SortName());
			t2.add(a1);
			t2.add(a2);
			t2.add(a3);
			t2.add(a4);
			for (Account aa : t2) {
				System.out.println(aa.toString());
			}
			break;

		case 3:
			TreeSet<Account> t3 = new TreeSet<Account>(new SortBalance());
			t3.add(a1);
			t3.add(a2);
			t3.add(a3);
			t3.add(a4);
			for (Account aa : t3) {
				System.out.println(aa.toString());
			}
			break;

		}

	}

}
