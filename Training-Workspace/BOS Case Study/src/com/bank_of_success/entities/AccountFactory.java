package com.bank_of_success.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bank_of_success.exceptions.InSufficientBalanceException;

public class AccountFactory {
    public static List<Account> accounts = new ArrayList<Account>();
    public static HashMap<Long, AccountStatus> checkActivationLog = new HashMap<Long, AccountStatus>();
    public static HashMap<Long, Float> balanceGetter = new HashMap<Long, Float>();
//    public static AccountStatus accountStatus = AccountStatus.OPEN;

    public static AbstractAccount create(long accountNumber, float balance, int pinNumber, String accountHolderName,
            Address address, AccountType accountType, AccountStatus accountStatus)
            throws InSufficientBalanceException {
        AbstractAccount account1 = null;
//        Address address = new Address("WhiteField", "Bangalore", 560095);
        if (accountType.equals(accountType.SAVING)) {
            account1 = new SavingAccount(accountNumber, balance, pinNumber, accountHolderName, address, accountType,
                    accountStatus,
                    "2003-11-19", "Male", 961160918);

//            account = new SavingAccount(initialbalance, AccountHolderName);
//            if (account1.open() == AccountStatus.ACTIVE ) {
////              accountStatus = AccountStatus.ACTIVE;
//                accounts.add(account1);
//                checkActivationLog.put(10001, account1.open());
//                System.out.println(checkActivationLog);
//            }
//            account1.open();
//            account1.withdraw(1000);
//            account1.deposite(2000);
        } else {
//            account = new CurrentAccount(10001, 10000, 1234, AccountHolderName, address, accountType, accountStatus,
//                    "HDFC", "hdfc.com", 10);
//            account1 = new CurrentAccount(initialbalance, AccountHolderName);
//            account1.open();
            ;
//            account1.withdraw(1000);
//            account1.deposite(2000);
        }
        return account1;
    }

//    public static void main(String args[]) throws InSufficientBalanceException {
//        AccountType accountType = AccountType.SAVING;
//        System.out.println(AccountFactory.create("Mayur", 10000, accountType));
//    }
}