import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimalNumber = 0;
		System.out.print("Enter The Binary Number : ");
		int binaryNumber = sc.nextInt();
		String binaryNumberString = Integer.toString(binaryNumber);
		for (int i = 0; i <= binaryNumberString.length() - 1; i++) {
			if (binaryNumberString.charAt(i) == '1') {
				decimalNumber += Math.pow(2, binaryNumberString.length() - i - 1);
			}
		}
		System.out.println("Decimal Representation Of " + binaryNumber + " : " + decimalNumber);
	}

}
