import java.util.*;

public class BinarySearch {

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
		int low = 0, high = arraySize - 1;
		if (binarySearch(array, low, high, searchElement))
			System.out.println(searchElement + " Is Found!");
		else
			System.out.println(searchElement + " Is Not Found!");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
//		Arrays.sort(array);
		System.out.print("Sorted Array : " + Arrays.toString(array));

	}

	public static boolean binarySearch(int[] array, int low, int high, int searchElement) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] == searchElement) {
				return true;
			} else if (array[mid] > searchElement)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return false;

	}

}
