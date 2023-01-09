package treeset;

import java.util.Comparator;

public class SortName implements Comparator<Account> {
	public int compare(Account a1, Account a2) {
		return a1.getName().compareTo(a2.getName());
	}

}
