import java.util.*;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The First Number (Base:X) : ");
		int X = sc.nextInt();
		System.out.print("Enter The Second Number (Exponent:n) : ");
		int n = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= n; i++) {
			power = power * X;
		}
		System.out.println(X + "^" + n + " : " + power);
	}

}
