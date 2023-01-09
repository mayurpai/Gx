package exception;

import java.util.Scanner;

//The classes that inherit the RuntimeException are known as unchecked exceptions. 
//For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
//Unchecked exceptions are not checked at compile-time, but they are checked at runtime.


public class MathDivision {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);)    // try with resources
		{   
			System.out.println("Enter num1 and num2");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			if(num2==0)
				throw new ArithmeticException("Divide by Zero Exception");
			double d=(double)(num1/num2);
			
			System.out.println(d);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
