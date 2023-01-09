import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		seriesOne(n);
		seriesTwo(n);
		seriesThree(n);
		seriesFour(n);
		seriesFive(n);
		seriesSix(n);
		seriesSeven(n);
		seriesEight(n);
		seriesNine(n);
		seriesTen(n);
	}

	// 4, 16, 36, 64, ... N
	public static void seriesOne(int n) {
		System.out.print("Series One : ");
		for (int i = 2; i <= n; i++) {
			System.out.print((i * i) + "\t");
			i++;
		}
		System.out.println();
	}

	// 1, 2, 3, 4, 5, 6, ... N
	public static void seriesTwo(int n) {
		System.out.print("Series Two : ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// 1, 4, 27, 256, 3125, ... N
	public static void seriesThree(int n) {
		System.out.print("Series Three : ");
		int count = 1;
		for (int i = 1; i <= n; i++, count++) {
			System.out.print((int) (Math.pow(i, count)) + "\t");
		}
		System.out.println();
	}

	// 1, 4, 7, 12, 23, 42, 77, ... N
	public static void seriesFour(int n) {
		System.out.print("Series Four : ");
		int first = 1, second = 4, third = 7;
		System.out.print(first + "\t");
		System.out.print(second + "\t");
		System.out.print(third + "\t");
		for (int i = 1; i <= n - 3; i++) {
			int sum = first + second + third;
			System.out.print(sum + "\t");
			first = second;
			second = third;
			third = sum;
		}
		System.out.println();
	}

	// 1, 4, 9, 25, 36, 49, 81, 100, ... N
	public static void seriesFive(int n) {
		System.out.print("Series Five : ");
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0)
				continue;
			System.out.print((i * i) + "\t");
		}
		System.out.println();
	}

	// 1, 5, 13, 29, 49, 77, ... N
	public static void seriesSix(int n) {
		System.out.print("Series Six : ");
		int prev = 1;
		int iterator = n + n % 3;
		System.out.print(prev + "\t");
		for (int i = 0; i <= iterator; i++) {
			if (i % 3 == 0)
				continue;
			System.out.print((prev + 4 * i) + "\t");
			prev += 4 * i;
		}
		System.out.println();
	}

	// 1, 2, 6, 15, 31, 56 ... N
	public static void seriesSeven(int n) {
		System.out.print("Series Seven : ");
		int prev = 1;
		for (int i = 0; i < n; i++) {
			int squareNumber = i * i;
			System.out.print((prev + squareNumber) + "\t");
			prev += squareNumber;
		}
		System.out.println();
	}

	// 1, 1, 2, 3, 5, 8, 13, ... N
	public static void seriesEight(int n) {
		System.out.print("Series Eight: ");
		int firstNum = 0, secondNum = 1, thirdNum = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(thirdNum + "\t");
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		System.out.println();
	}

	// 1, 5, 8, 14, 27, 49, ... N
	public static void seriesNine(int n) {
		System.out.print("Series Nine: ");
		int first = 1, second = 5, third = 8;
		System.out.print(first + "\t");
		System.out.print(second + "\t");
		System.out.print(third + "\t");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = first + second + third;
			System.out.print(sum + "\t");
			first = second;
			second = third;
			third = sum;
		}
		System.out.println();
	}

	// 1, 2, 4, 6, 7,10, 10,14... N
	public static void seriesTen(int n) {
		System.out.print("Series Ten: ");
		int i = 1, j = 2, count = 1;
		for (int k = 0; k < n; k++) {
			if (count % 2 != 0) {
				System.out.print(i + "\t");
				i += 3;
			} else {
				System.out.print(j + "\t");
				j += 4;
			}
			count++;
		}
		System.out.println();
	}

}
