import java.util.*;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter The Number: ");
		number = sc.nextInt();
		String[] numberResult = { "Even", "Odd" };
		System.out.println(number + " Is An " + numberResult[number % 2] + " Number");
	}

}
