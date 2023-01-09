import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String : ");
		String string = sc.nextLine();
		if (palindromeChecker(string.toLowerCase()))
			System.out.println(string + " Is A Palindrome");
		else
			System.out.println(string + " Is Not A Palindrome");

	}

	public static boolean palindromeChecker(String string) {
		String reversedString = "";
		string.toCharArray();
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString += string.charAt(i);
		}
		if (string.equals(reversedString))
			return true;
		else
			return false;
	}

}
