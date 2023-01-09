import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value Of N : ");
		int n = sc.nextInt();
		int factorial = 1;
		if (n <= 0)
			System.out.println("Factorial Of " + n + " Is : " + factorial);
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("Factorial Of " + n + " Is : " + factorial);

	}

}
