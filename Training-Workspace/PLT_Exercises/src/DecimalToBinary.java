import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] binaryArray = new int[8];
		int binaryDivisor = 1;
		System.out.print("Enter The Decimal Number : ");
		int decimalNumber = sc.nextInt();
		int actualNumber = decimalNumber;
		int k = 0;
		while (binaryDivisor >= 1) {
			binaryArray[k] = decimalNumber % 2;
			binaryDivisor = decimalNumber / 2;
			decimalNumber = binaryDivisor;
			k++;
		}
		int i, j;
		for (i = 0, j = binaryArray.length - 1; i < binaryArray.length / 2; i++, j--) {
			int temp = binaryArray[i];
			binaryArray[i] = binaryArray[j];
			binaryArray[j] = temp;
		}
		for (i = 0; i < binaryArray.length; i++) {
			System.out.print(binaryArray[i]);
		}

	}

}
