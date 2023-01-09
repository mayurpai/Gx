public class TestMain {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Please enter 3 marks!");
			System.exit(0);
		}
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		

		
		ResultFinder finder = new ResultFinder();
		

		
		finder.displayMarks();
		
		System.out.println("Total : " + finder.getTotal());
		System.out.println("Average : " + finder.getAverage());
		System.out.println("Result : " + finder.getResult());
	}
}
