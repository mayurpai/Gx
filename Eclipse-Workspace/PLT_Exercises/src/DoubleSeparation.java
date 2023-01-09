import java.util.*;

public class DoubleSeparation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		double number = sc.nextDouble();
		int num = (int) (number);
		double fraction = number - num;
		System.out.println("Number : " + num);
		System.out.println("Fraction : " + (float) fraction);
	}
	
}
