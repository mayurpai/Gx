package day_2;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Mayur"; // immutable
//		name = "Mayur Pai";
		String name_2 = new String("Mayur");
		System.out.println(name);
		System.out.println(name.length());
		String names = name.concat(" B H");
		System.out.println(name); // Mayur Pai
		System.out.println(names); // Mayur Pai B H
		String name_1 = "Mayur";

		System.out.println(name == name_1); // == : Reference (true)
		System.out.println(name.equals(name_1)); // .equals : Value (true)

		System.out.println(name == name_2); // == : Reference (false)
		System.out.println(name.equals(name_2)); // .equals : Value (true)

		StringBuffer sb = new StringBuffer("Hello"); // Mutable - Thread Safe
		sb.append(" GalaxE");
		System.out.println(sb);

		StringBuilder sb_1 = new StringBuilder("Hello"); // Mutable- Not Thread Safe
		sb_1.append(" GalaxE");
		System.out.println(sb_1);
	}

}
