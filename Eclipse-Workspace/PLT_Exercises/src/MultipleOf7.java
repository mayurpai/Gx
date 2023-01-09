import java.util.*;

public class MultipleOf7 {

	public static void main(String[] args) {
		divideBy2();
		divideBy3();
		divideBy4();
		divideBy5();
		divideBy6();
	}

	public static void divideBy2() {
		int count = 0;
		System.out.print("Divide By 2 : ");
		for (int i = 1; i < 1000; i++) {
			if (i % 7 == 0 && i % 2 == 1) {
				count++;
				if (count == 3)
					continue;
				System.out.print(i + "\t");
				if (count == 4)
					break;

			}
		}
		System.out.println();
	}

	public static void divideBy3() {
		int count = 0;
		System.out.print("Divide By 3 : ");
		for (int i = 1; i < 1000; i++) {
			if (i % 7 == 0 && i % 3 == 1) {
				count++;
				if (count == 3)
					continue;
				System.out.print(i + "\t");
				if (count == 4)
					break;

			}
		}
		System.out.println();
	}

	public static void divideBy4() {
		int count = 0;
		System.out.print("Divide By 4 : ");
		for (int i = 1; i < 1000; i++) {
			if (i % 7 == 0 && i % 4 == 1) {
				count++;
				if (count == 3)
					continue;
				System.out.print(i + "\t");
				if (count == 4)
					break;

			}
		}
		System.out.println();
	}

	public static void divideBy5() {
		int count = 0;
		System.out.print("Divide By 5 : ");
		for (int i = 1; i < 1000; i++) {
			if (i % 7 == 0 && i % 5 == 1) {
				count++;
				if (count == 3)
					continue;
				System.out.print(i + "\t");
				if (count == 4)
					break;

			}
		}
		System.out.println();
	}

	public static void divideBy6() {
		int count = 0;
		System.out.print("Divide By 6 : ");
		for (int i = 1; i < 1000; i++) {
			if (i % 7 == 0 && i % 6 == 1) {
				count++;
				if (count == 3)
					continue;
				System.out.print(i + "\t");
				if (count == 4)
					break;

			}
		}
		System.out.println();
	}

}
