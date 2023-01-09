package bank;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankApp b = new BankApp();
		Account a1 = new Account(1, "aa", 21000);
		Account a2 = new Account(2, "ab", 22000);
		Account a3 = new Account(3, "ac", 20000);
		Account a4 = new Account(4, "ad", 22000);
		Account a5 = new Account(5, "ae", 25000);
		
		List<Account> accs = new LinkedList<Account>();
		accs.add(a1);
		accs.add(a2);
		accs.add(a3);
		accs.add(a4);
		accs.add(a5);
	
		int c=b.checkEquality(accs);
		System.out.println(c);

	}

}
