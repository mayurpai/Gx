package com.java.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * Method Reference Is Used To Refer Method Of The Functional Interface.
 * It Is Compact And Easy Form Of A Lambda Expression. 
 * 
 * Each Time When You Are Using Lambda Expression To Just Referring 
 * A Method, You Can Replace Your Lambda Expression With A Method  Reference. */

/*
 * Types Of Method References: 
 * 
 * A. Method Reference To Static Method: Class::StaticMethodName
 * B. Reference To An Instance Method Of A Particular Object: Object::InstanceMethodName
 * C. Reference To An Instance Method Of An Arbitrary Object Of Specific Type: Class::InstanceMethodName
 * D. Reference To A Constructor: ClassName::new
 * */

@FunctionalInterface
interface Printable {
	void print(String message);
}

public class MethodReferences {

	public void display(String message) {
		message = message.toUpperCase();
		System.out.println(message);
	}

	public static int addition(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

	public static void main(String[] args) {
//		A. Method Reference To Static Method: Class::StaticMethodName
//		Lambda Expression
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(6));

//		Method Reference
		Function<Integer, Double> functionMethodReference = Math::sqrt;
		System.out.println(functionMethodReference.apply(6));

//		Lambda Expression
		BiFunction<Integer, Integer, Integer> biFunction = (numberOne, numberTwo) -> MethodReferences
				.addition(numberOne, numberTwo);
		System.out.println(biFunction.apply(20, 10));

//		Method Reference
		BiFunction<Integer, Integer, Integer> biFunctionMethodReference = MethodReferences::addition;
		System.out.println(biFunction.apply(20, 10));

//		B. Reference To An Instance Method Of A Particular Object: Object::InstanceMethodName
		MethodReferences methodReferences = new MethodReferences();
//		Lambda Expression
		Printable printable = (message) -> methodReferences.display(message);
		printable.print("Hey");

//		Method Reference
		Printable printableMethodReference = methodReferences::display;
		printableMethodReference.print("Hey");

//		C. Reference To An Instance Method Of An Arbitrary Object Of Specific Type: Class::InstanceMethodName
//		Lambda Expression
		Function<String, String> stringFunction = (String input) -> input.toUpperCase();
		System.out.println(stringFunction.apply("Mayur"));

//		Method Reference
		Function<String, String> stringFunctionMethodReference = String::toUpperCase;
		System.out.println(stringFunction.apply("Mayur"));

		String[] strArray = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
//		Lambda Expression
		Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(strArray));

//		Method Reference
		Arrays.sort(strArray, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(strArray));

//		D. Reference To A Constructor: ClassName::new
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Water Melon");
		
//		Lambda Expression		
		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList); 
		System.out.println(setFunction.apply(fruits));
		
//		Method Reference
		Function<List<String>, Set<String>> setFunctionMethodReference = HashSet::new; 
		System.out.println(setFunction.apply(fruits));
		
	}

}
