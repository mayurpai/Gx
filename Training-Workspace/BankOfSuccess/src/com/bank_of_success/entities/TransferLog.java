package com.bank_of_success.entities;

import java.util.HashMap;
import java.util.List;

public class TransferLog {

	public HashMap<String, List<TransferInfo>> transfers = new HashMap<String, List<TransferInfo>>();

	public double getAmountTransfered(long accountNumber) {
		return accountNumber;

	}

	public void logTransfer(TransferInfo transferInfo) {

	}

	public TransferLog() {
		// TODO Auto-generated constructor stub
	}

}
