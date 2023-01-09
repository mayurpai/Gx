import java.util.*;

public class FactorialRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value Of N : ");
		int n = sc.nextInt();
		int fact = factorial(n);
		System.out.println("Factorial Of " + n + " : " + fact);
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}
