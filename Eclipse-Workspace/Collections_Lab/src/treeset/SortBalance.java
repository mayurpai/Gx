package treeset;

import java.util.Comparator;

public class SortBalance implements Comparator<Account> {
	public int compare(Account a1, Account a2) {
		if (a1.getBalance() < a2.getBalance())
			return -1;
		else if (a1.getBalance() > a2.getBalance())
			return 1;
		else
			return 0;
	}

}
