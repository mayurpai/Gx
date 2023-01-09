package treeset;



public class Account {

	private int accId;
	private String name;
	private double balance;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accId, String name, double balance) {
		super();
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	
	public boolean equals(Account a)
	{
		if(this.getBalance()==a.getBalance())
			return true;
		else
			return false;
		
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
