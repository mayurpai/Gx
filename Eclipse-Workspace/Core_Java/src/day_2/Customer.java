package day_2;

public class Customer {
	
	int billAmount;

	public Customer() {
		super();
	}
	
	public Customer(int billAmount) {
		super();
		this.billAmount = billAmount;
	}


	public static void main(String[] args) {
		Customer c = new Customer(); 
		System.out.println("Customer");
		// Default Constructor Won't Be Created If We Create Any Other Kind Of Constructor

	}

}
