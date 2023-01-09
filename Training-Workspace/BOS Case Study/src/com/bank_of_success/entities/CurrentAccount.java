package com.bank_of_success.entities;

import com.bank_of_success.exceptions.InSufficientBalanceException;

public class CurrentAccount extends AbstractAccount {

    private String companyName;
    private String website;
    private Integer registrationNumber;
    public AccountStatus accountStatus;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public CurrentAccount(long accountNumber, float balance, int pinNumber, String accountHolderName, Address address,
            AccountType accountType, AccountStatus status, String companyName, String website,
            Integer registrationNumber) {
        super(accountNumber, balance, pinNumber, accountHolderName, address, accountType, status);
        this.companyName = companyName;
        this.website = website;
        this.registrationNumber = registrationNumber;
        this.accountStatus = status;
    }

    public boolean checkRegistrationNumber() {
        if (getRegistrationNumber() == null) {
            System.out.println("Throws Exception");
            return false;
        } else {
            return true;
        }
    }

//    public CurrentAccount(long accountNumber, float balance, int pinNumber, String accountHolderName, Address address,
//            AccountType accountType,
//            AccountStatus status) {
//        super(accountNumber, balance, pinNumber, accountHolderName, address, accountType, status);
//    }

    public CurrentAccount(float balance, String accountHolderName) {
        super(balance, accountHolderName);
    }

    @Override
    public AccountStatus open() {
        if (checkRegistrationNumber()) {
            accountStatus = AccountStatus.ACTIVE;
            System.out.println("Saving Account Is Open");
        } else {
            System.out.println("Registration Number Invalid");
            accountStatus = AccountStatus.CLOSED;
        }
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
            System.out.println(1);
            if (amount > balance) {
                throw new InSufficientBalanceException(
                        "Amount Withdrawing Should Be Less Than The Existing Balance!");
            } else if (amount <= balance) {
                balance = (float) (balance - amount);
                System.out.println("Available Balance: " + balance);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CurrentAccount [ companyName=" + companyName + ", website="
                + website + ", registrationNumber=" + registrationNumber + ", accountNumber=" + accountNumber
                + ", balance=" + balance + ", pinNumber=" + pinNumber + ", accountHolderName=" + accountHolderName
                + ", address=" + address + "]";
    }

    @Override
    public boolean deposite(double amount) {
        if (accountStatus == AccountStatus.OPEN) {
            balance = (float) (balance + amount);
            System.out.println("Available Balance: " + balance);
        }
        return false;
    }

}
