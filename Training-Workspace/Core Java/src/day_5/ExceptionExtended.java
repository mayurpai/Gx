package day_5;

public class ExceptionExtended {

	public static int m(int i) {
		System.out.println("Apple");
		try {
			i++;
			int num = 1 / 0;
			System.out.println("Ball");
			throw new ArithmeticException();

		} finally {
			i += 5;
			System.out.println("Dog");
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println(m(0));
		System.out.println("Thanks For Using My Program!");

	}

}
