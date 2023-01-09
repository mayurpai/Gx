import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value Of N : ");
		int n = sc.nextInt();
		if (fibonacciChecker(n))
			System.out.println(n + " Is A Fibonacci Number");
		else
			System.out.println(n + " Is Not A Fibonacci Number");

	}

	public static boolean fibonacciChecker(int n) {
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			if (c == n)
				return true;
			a = b;
			b = c;
		}
		return false;
	}

}
