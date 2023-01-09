import java.util.*;

public class PrimeSumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Start Range : ");
		int startRange = sc.nextInt();
		System.out.print("Enter The End Range : ");
		int endRange = sc.nextInt();
		int sum = 0;
		for (int i = startRange; i <= endRange; i++) {
			if (primeChecker(i)) {
				System.out.println(i + "\t");
				sum += i;
			}
		}
		System.out.println("Sum : " + sum);
	}

	public static boolean primeChecker(int n) {
		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
