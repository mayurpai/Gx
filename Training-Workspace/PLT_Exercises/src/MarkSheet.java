import java.util.*;

public class MarkSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Name : ");
		String name = sc.nextLine();
		int subjectOne, subjectTwo, subjectThree;
		System.out.print("Enter The Subject 1 Marks : ");
		subjectOne = sc.nextInt();
		System.out.print("Enter The Subject 2 Marks : ");
		subjectTwo = sc.nextInt();
		System.out.print("Enter The Subject 3 Marks : ");
		subjectThree = sc.nextInt();
		int total = subjectOne + subjectTwo + subjectThree;
		int average = total / 3;
		System.out.println("Name : " + name);
		System.out.println("Total : " + total);
		System.out.println("Average : " + average);
		if (average >= 60)
			System.out.println("First Class");
		else if (average >= 50)
			System.out.println("Second Class");
		else if (average >= 35)
			System.out.println("Pass Class");
		else
			System.out.println("Fail");
	}

}
