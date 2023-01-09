import java.util.*;

public class SumOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value of N : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i += 2)
			sum += i;
		System.out.println("Sum : " + sum);
	}

}
