package com.bank_of_success.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.bank_of_success.exceptions.InSufficientBalanceException;

public class AccountManager extends AccountFactory {

//    static List<Account> accounts = new ArrayList<Account>();
//    static HashMap<Integer, AccountStatus> checkActivationLog = new HashMap<Integer, AccountStatus>();
    TransferInfo info = new TransferInfo(10001, 10002, 30000, TransferMode.NEFT, 1234);
    Iterator itr = accounts.iterator();

    public AccountManager() {
        // TODO Auto-generated constructor stub
    }

//    public boolean checkStatus() {
//        if (checkActivationLog.containsKey(info.getFromAccount())
//                && checkActivationLog.containsKey(info.getToAccount())) {
//            if (checkActivationLog.containsKey(info.getFromAccount())) {
//
//            }
//        }
//    }

    public static void main(String args[]) throws InSufficientBalanceException {
        Address address = new Address("WhiteField", "Bangalore", 560095);
        AbstractAccount account1 = AccountFactory.create(10001, 10000, 1234, "Mayur", address, AccountType.SAVING,
                AccountStatus.OPEN);
        AbstractAccount account2 = AccountFactory.create(10002, 5000, 2434, "XYZ", address, AccountType.SAVING,
                AccountStatus.OPEN);
//        account.open();
//        accounts.add(account);
//        accounts.add(account2);
//        checkActivationLog.put(accounts, null)
        if (account1.open() == AccountStatus.ACTIVE && account2.open() == AccountStatus.ACTIVE) {
//          accountStatus = AccountStatus.ACTIVE;
            accounts.add(account1);
            accounts.add(account2);
            balanceGetter.put(account1.getAccountNumber(), account1.getBalance());
            balanceGetter.put(account2.getAccountNumber(), account2.getBalance());
            checkActivationLog.put(account1.getAccountNumber(), account1.open());
            checkActivationLog.put(account2.getAccountNumber(), account2.open());
            account2.withdraw(1000);
            account1.deposite(1000);
            System.out.println(balanceGetter);
//            accounts.get(0).withdraw(1000);
//            accounts.get(1).deposite(1000);
//            System.out.println(accounts);
//            account2.deposite(2000);
//            System.out.println(checkActivationLog);
            for (Account a : accounts) {
                System.out.println(a);
            }
        }
//        account.withdraw(1000);
//        account.deposite(2000);
//        System.out.println(accounts);
//        System.out.println(account);

    }

}
