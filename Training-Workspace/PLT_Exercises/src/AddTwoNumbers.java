import java.util.*;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The First Number : ");
		Integer numberOne = sc.nextInt();
		System.out.print("Enter The Second Number : ");
		Integer numberTwo = sc.nextInt();
		Integer result = numberOne + numberTwo;
		System.out.println("Sum Of " + numberOne + " + " + numberTwo + " = " + result);
		sc.close();
	}

}
