	import java.util.*;
	
	public class NumberToWords {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter The Number : ");
			int number = sc.nextInt();
			numbers((number / 1000000000), " Hundred ");
			numbers((number / 10000000) % 100, " Crore ");
			numbers(((number / 100000) % 100), " Lakh ");
			numbers(((number / 1000) % 100), " Thousand ");
			numbers(((number / 100) % 10), " Hundred ");
			numbers((number % 100), " ");
	
		}
	
		public static void numbers(int number, String ch) {
			String ones[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
					" Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen",
					" Nineteen" };
	
			String tens[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty",
					" Ninety" };
	
			if (number > 19)
				System.out.print((tens[number / 10] + " " + ones[number % 10]).trim());
			else
				System.out.print((ones[number]).trim());
			if (number > 0)
				System.out.print(ch);
		}
	
	}
