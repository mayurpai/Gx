import java.util.*;

public class LCMOfAnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Count : ");
		int count = sc.nextInt();
		int LCM = 1;
		for (int i = 1; i <= count; i++) {
			System.out.print("Enter The Number " + i + " : ");
			int n = sc.nextInt();
			LCM = LCMCal(n, LCM);
		}
		System.out.println("LCM : " + LCM);

	}

	public static int LCMCal(int n, int LCM) {
		int GCD = 1;
		for (int i = 1; i <= n && i <= LCM; ++i) {
			if (n % i == 0 && LCM % i == 0)
				GCD = i;
		}
		LCM = (n * LCM) / GCD;
		return LCM;
	}

}
