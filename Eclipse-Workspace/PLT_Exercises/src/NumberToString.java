import java.util.*;

public class NumberToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, rev = 0;
		System.out.print("Enter The Number : ");
		n = sc.nextInt();
		while (n > 0) {
			int temp = n % 10;
			rev = rev * 10 + temp;
			n = n / 10;
		}
		while (rev > 0) {
			int temp = rev % 10;
			rev = rev / 10;
			switch (temp) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;

			default:
				break;
			}

		}

	}

}
