package com.bank_of_success.exceptions;

public class InSufficientBalanceException extends Exception {

    public InSufficientBalanceException(String string) {
        System.out.println(string);
    }

}
