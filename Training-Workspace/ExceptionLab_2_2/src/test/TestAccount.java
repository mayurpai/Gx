package test;

import bank.Account;

public class TestAccount {

	public static void main(String[] args) throws ClassNotFoundException {
		Class class1 = Class.forName("bank.Account");

		try {
			Account account = (Account) class1.newInstance();        //Run successfully constructor of account get called

		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}
		
		
		try {
			Class c2=Class.forName("a.Account");
		} catch (Exception e) {													//shows class not found exception
			e.printStackTrace();
		}
	}

}
