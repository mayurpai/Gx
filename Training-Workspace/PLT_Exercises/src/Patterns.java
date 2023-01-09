import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
//		int rowNumber = sc.nextInt();
		int rowNumber = 5;
		patternOne(rowNumber);
		System.out.println();
		patternTwo(rowNumber);
		System.out.println();
		patternThree(rowNumber);
		System.out.println();
		patternFour(rowNumber);
		System.out.println();
		patternFive(rowNumber);
		System.out.println();
		patternSix(rowNumber);
		System.out.println();
		patternSeven(rowNumber);
		System.out.println();
		patternEight(rowNumber);
		System.out.println();
		patternNine(rowNumber);
		System.out.println();
		patternTen(rowNumber);
		System.out.println();
		patternEleven(rowNumber);
		System.out.println();
		patternTwelve(rowNumber);
		System.out.println();
	}

	public static void patternOne(int rowNumber) {
//		***** 
//		***** 
//		***** 
//		***** 
//		: 
//		N rows
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < rowNumber; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void patternTwo(int rowNumber) {
//		11111 
//		22222 
//		33333 
//		44444 
//		: 
//		N rows
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 0; j < rowNumber; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void patternThree(int rowNumber) {
//		12345 
//		12345 
//		12345 
//		12345 
//		: 
//		N rows 
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= rowNumber; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void patternFour(int rowNumber) {
//		* 
//		** 
//		*** 
//		**** 
//		: 
//		N rows
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void patternFive(int rowNumber) {
//		1 
//		12 
//		123 
//		1234 
//		: 
//		N rows 
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void patternSix(int rowNumber) {
//		1 
//		22 
//		333 
//		4444 
//		: 
//		N rows
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void patternSeven(int rowNumber) {
//		1 
//		23 
//		456 
//		7 8 9 10 
//		: 
//		N rows
		int count = 1;
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	public static void patternEight(int rowNumber) {
//		1 
//		12 
//		358 
//		: 
//		: 
//		N rows
		int firstNum = 0, secondNum = 1, thirdNum = 1;
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(thirdNum + " ");
				thirdNum = firstNum + secondNum;
				firstNum = secondNum;
				secondNum = thirdNum;
			}
			System.out.println();
		}
	}

	public static void patternNine(int rowNumber) {
//		1 
//		-4 9 
//		-16 25 -36 
//		: 
//		: 
//		N rows 
		int square = 1;
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= i; j++, square++) {
				if (square % 2 != 0)
					System.out.print(square * square + " ");
				else
					System.out.print("- " + (square * square) + " ");
			}
			System.out.println();
		}
	}

	public static void patternTen(int rowNumber) {
//		   * 
//		  ** 
//		 *** 
//	    **** 
//		 : 
//		N rows
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= rowNumber - i; j++)
				System.out.print(" ");
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void patternEleven(int rowNumber) {
//		   * 
//		  *** 
//		 ***** 
//		******** 
//		   : 
//		 N rows
		int k = 1;
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= rowNumber - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			k += 2;
			System.out.println();
		}
	}

	public static void patternTwelve(int rowNumber) {
//		1 
//		1 2 
//		6 24 120 
//		: 
//		: 
//		N rows
		int count = 1, prev = 1;
		System.out.println(prev);
		for (int i = 2; i < rowNumber; i++) {
			for (int j = 1; j <= i; j++, count++) {
				System.out.print((prev * count) + " ");
				prev = prev * count;
			}
			System.out.println();
		}
	}

}
