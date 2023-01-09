
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal, time, rate;
		System.out.print("Enter The Principal : ");
		principal = sc.nextDouble();
		System.out.print("Enter The Time : ");
		time = sc.nextDouble();
		System.out.print("Enter The Rate : ");
		rate = sc.nextDouble();
		System.out.println("Simple Interest = " + principal * time * rate / 100);

		/*
		 * OR
		 * 
		 * double principal = Double.parseDouble(args[0]); double time =
		 * Double.parseDouble(args[1]); double rate = Double.parseDouble(args[2]);
		 * 
		 */

	}

}
