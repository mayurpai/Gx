package com.bank_of_success.entities;

import java.time.LocalDateTime;

public abstract class AbstractAccount implements Account {
    
    protected long accountNumber;
    protected float balance;
    protected int pinNumber;
    protected String accountHolderName;
    protected Address address;
    protected LocalDateTime activatedDate;
    protected LocalDateTime closedDate;
    private AccountType accountType;
    private AccountStatus status;

    public AbstractAccount(long accountNumber, float balance, int pinNumber, String accountHolderName, Address address,
            AccountType accountType, AccountStatus status) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pinNumber = pinNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.accountType = accountType;
        this.status = status.OPEN;
    }

    public AbstractAccount(float balance2, String accountHolderName2) {
        super();
        this.balance = balance2;
        this.accountHolderName = accountHolderName2;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    
}
