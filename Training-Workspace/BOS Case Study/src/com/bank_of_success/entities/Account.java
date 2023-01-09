package com.bank_of_success.entities;

import com.bank_of_success.exceptions.InSufficientBalanceException;

public interface Account {

    public AccountStatus open();

    public boolean close();

    public boolean withdraw(double amount) throws InSufficientBalanceException;

    public boolean deposite(double amount);

}
