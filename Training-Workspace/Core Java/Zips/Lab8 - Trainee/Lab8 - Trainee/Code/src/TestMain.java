public class TestMain {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Pass a double val!");
			System.exit(0);
		}
		
		double num = 0;
		int whole = 0;
		double fraction = 0;
		
	

		System.out.println("Whole : " + whole);
		System.out.printf("Fraction : %.3f\n" , fraction);

		// Explain how this works to the trainees....
		System.out.println("The number is " + (DecimalSplitter.isOdd(whole) ? "Odd" : "Even"));
	}
}
