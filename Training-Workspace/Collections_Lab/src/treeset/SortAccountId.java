package treeset;

import java.util.Comparator;

public class SortAccountId implements Comparator<Account> {
	public int compare(Account a1, Account a2) {
		return a1.getAccId() - a2.getAccId();
	}

}
