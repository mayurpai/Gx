package day_7;

public class DesignPatternDemoBank {

	public static void main(String[] args) {
		DesignPatternDemoPayment mayur = DesignPatternDemoPayment.getPaymentInstance();
		mayur.deposit(7600, "Mayur");
		DesignPatternDemoPayment kavya = DesignPatternDemoPayment.getPaymentInstance();
		kavya.deposit(4500, "Kavya");
		DesignPatternDemoPayment nagendra = DesignPatternDemoPayment.getPaymentInstance();
		nagendra.deposit(400, "Nagendra");

	}

}
