import java.util.Scanner;

public class LCMOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Count : ");
		int count = sc.nextInt();
		int LCM = 1;
		int[] array = new int[count];
		System.out.print("Enter The Numbers : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			LCM = LCMCal(array[i], LCM);
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
