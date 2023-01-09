package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BankApp {
	
	
	
	public static int checkEquality(List<Account> accounts)
	{
		int count=0;
		HashMap<Double,Boolean> hm = new HashMap<Double, Boolean>();
		
		for(Account a : accounts)
		{
			if(!hm.containsKey(a.getBalance()))
			{
				hm.put(a.getBalance(), false);
				
			}
			else
			{
				if(hm.get(a.getBalance())==false)
				{
					hm.put(a.getBalance(), true);
					count+=2;
				}
				else
					count+=1;
			}
		}
		System.out.println(hm);
		
		return count;
	}

}
