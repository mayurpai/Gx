import java.util.*;

public class DisplaySwapShow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne, numberTwo;
		System.out.print("Enter The Number 1 : ");
		numberOne = sc.nextInt();
		System.out.print("Enter The Number 2 : ");
		numberTwo = sc.nextInt();
		System.out.println("Before Swapping : Number 1 = " + numberOne + " and " + "Number 2 = " + numberTwo);
		int temp;
		temp = numberOne;
		numberOne = numberTwo;
		numberTwo = temp;

		/*
		 * OR
		 * 
		 * numberOne = numberOne + numberTwo; numberTwo = numberOne - numberTwo;
		 * numberOne = numberOne - numberTwo;
		 * 
		 */
		System.out.println("After Swapping : Number 1 = " + numberOne + " and " + "Number 2 = " + numberTwo);

	}

}
