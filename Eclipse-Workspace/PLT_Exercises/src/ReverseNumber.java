import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int number = sc.nextInt();
		int reversedNumber = 0;
		while (number > 0) {
			int temp = number % 10;
			reversedNumber = temp + reversedNumber * 10;
			number /= 10;
		}
		System.out.println("Reversed Number " + reversedNumber);

	}

}
