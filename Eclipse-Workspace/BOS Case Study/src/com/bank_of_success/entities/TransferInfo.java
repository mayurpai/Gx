package com.bank_of_success.entities;

public class TransferInfo {

    private int fromAccount;
    private int toAccount;
    private double transferAmount;
    private TransferMode transferMode;
    private int pinNumber;

    public int getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(int fromAccount) {
        this.fromAccount = fromAccount;
    }

    public int getToAccount() {
        return toAccount;
    }

    public void setToAccount(int toAccount) {
        this.toAccount = toAccount;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public TransferMode getTransferMode() {
        return transferMode;
    }

    public void setTransferMode(TransferMode transferMode) {
        this.transferMode = transferMode;
    }

    public TransferInfo(int fromAccount, int toAccount, double transferAmount, TransferMode transferMode,
            int pinNumber) {
        super();
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transferAmount = transferAmount;
        this.transferMode = transferMode;
        this.pinNumber = pinNumber;
    }

    @Override
    public String toString() {
        return "TransferInfo [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", transferAmount="
                + transferAmount + ", transferMode=" + transferMode + ", pinNumber=" + pinNumber + "]";
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

}