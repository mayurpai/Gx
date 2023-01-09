import java.util.*;

public class LargestSecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest, secondLargest;
		System.out.print("Enter The Number 1 : ");
		int numberOne = sc.nextInt();
		System.out.print("Enter The Number 2 : ");
		int numberTwo = sc.nextInt();
		System.out.print("Enter The Number 3 : ");
		int numberThree = sc.nextInt();
		largest = Math.max(Math.max(numberOne, numberTwo), numberThree);
		System.out.println("Largest : " + largest);
		int smallest = Math.min(Math.min(numberOne, numberTwo), numberThree);
		if ((numberOne != largest && numberOne != smallest))
			System.out.println("Second Largest : " + numberOne);
		else if ((numberTwo != largest && numberTwo != smallest))
			System.out.println("Second Largest : " + numberTwo);
		else
			System.out.println("Second Largest : " + numberThree);
	}

}
