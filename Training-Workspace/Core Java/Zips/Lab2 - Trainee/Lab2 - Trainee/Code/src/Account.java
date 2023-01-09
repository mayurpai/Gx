public class Account {
	String accNo;
	String name;
	double balance;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		String bankCode = "ICI";
		this.accNo = bankCode + accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance + computeInterest();
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	private double computeInterest() {
		double interest = balance * 8.5 / 100.0;
		return interest;
	}
}
