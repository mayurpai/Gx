import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of The Array : ");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Array Elements : " + Arrays.toString(array));
		System.out.println();
		System.out.print("Enter The Search Element : ");
		int searchElement = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arraySize; i++) {
			if (array[i] == searchElement) {
				flag = true;
				break;
			}

		}
		if (flag)
			System.out.println(searchElement + " Is Found!");
		else
			System.out.println(searchElement + " Is Not Found!");

	}

}
