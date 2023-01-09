package day_7;

public class DesignPatternDemoPayment {

	 static DesignPatternDemoPayment dp;

	private DesignPatternDemoPayment() {
		System.out.println("Payment Object Created");
	}

	public static DesignPatternDemoPayment getPaymentInstance() {
		if (dp == null)
			dp = new DesignPatternDemoPayment();
		return dp;
	}

	public void deposit(int amount, String name) {
		System.out.println("INR " + amount + " Deposited By: " + name);

	}

}
