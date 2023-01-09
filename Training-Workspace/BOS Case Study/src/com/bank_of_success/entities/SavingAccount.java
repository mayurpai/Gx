package com.bank_of_success.entities;

import java.time.LocalDate;
import java.time.Period;

import com.bank_of_success.exceptions.InSufficientBalanceException;

public class SavingAccount extends AbstractAccount {

    private String dateOfBirth;
    private String gender;
    private long phoneNumber;
    public AccountStatus accountStatus;

    public SavingAccount(long accountNumber, float balance, int pinNumber, String accountHolderName, Address address,
            AccountType accountType, AccountStatus status, String dateOfBirth, String gender, long phoneNumber) {
        super(accountNumber, balance, pinNumber, accountHolderName, address, accountType, status);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.accountStatus = status;
    }

    public boolean ageValidation() {
        LocalDate l = LocalDate.parse(dateOfBirth);
        Period diff = Period.between(l, LocalDate.now());
        if (diff.getYears() < 18) {
            System.out.println("Throws Exception");
            return false;
        } else {
            return true;
        }
    }

//    public SavingAccount(long accountNumber, float balance, int pinNumber, String accountHolderName, Address address,
//            AccountType accountType,
//            AccountStatus status) {
//        super(accountNumber, balance, pinNumber, accountHolderName, address, accountType, status);
//    }

    public SavingAccount(float balance, String accountHolderName) {
        super(balance, accountHolderName);
    }

    @Override
    public AccountStatus open() {
        if (!ageValidation()) {
            System.out.println("Age Invalid");
            accountStatus = AccountStatus.CLOSED;
            return accountStatus;
        }
        accountStatus = AccountStatus.ACTIVE;
        System.out.println(accountStatus);
        System.out.println("Saving Account Is Open");
        return accountStatus;

    }

    @Override
    public boolean close() {
        System.out.println("Saving Account Is Closed");
        accountStatus = AccountStatus.CLOSED;
        return true;
    }

    @Override
    public boolean withdraw(double amount) throws InSufficientBalanceException {
        if (accountStatus == AccountStatus.OPEN) {
            if (amount > this.balance) {
                throw new InSufficientBalanceException(
                        "Amount Withdrawing Should Be Less Than The Existing Balance!");
            } else if (amount <= this.balance) {
                this.balance = (float) (this.balance - amount);
                System.out.println("Available Balance: " + this.balance);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SavingAccount [dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", phoneNumber=" + phoneNumber
                + ", accountNumber=" + accountNumber + ", balance=" + balance + ", pinNumber=" + pinNumber
                + ", accountHolderName=" + accountHolderName + ", address=" + address + "]";
    }

    @Override
    public boolean deposite(double amount) {
        if (accountStatus == AccountStatus.OPEN) {
            this.balance = (float) (this.balance + amount);
            System.out.println("Available Balance: " + this.balance);
        }
        return false;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.CURRENT;
    }

}
