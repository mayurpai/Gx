package com.java.optional;

import java.util.Optional;

/*
 * This Class Can Help In Avoiding Null Checks And Null Pointer Exceptions.
 * You Can View Optional As A Single Value Container That Either Contains A Value Or 
 * Doesn't (It Is Then Said To Be Empty). */
public class OptionalDemo {

	public static void main(String[] args) {
		// of, empty, ofNullable

		String name = "Mayur";
		String anonymous = null;

		// It Returns EMPTY If Object Is Null (Optional.empty)
		Optional<Object> emptyOptional = Optional.empty();
		Optional<Object> emptyOptionalAnonymous = Optional.empty();
		System.out.println(emptyOptional);
		System.out.println(emptyOptionalAnonymous);

		// It Performs null Check
		Optional<String> nameOptional = Optional.of(name);
//		Optional<String> nameOptionalAnonymous = Optional.of(anonymous);
		System.out.println(nameOptional);
		System.out.println(nameOptional.get());
//		System.out.println(nameOptionalAnonymous);

		// It Returns EMPTY If Object Is Null (Optional.empty)
		Optional<String> stringOptional = Optional.ofNullable(name);
		Optional<String> stringOptionalAnonymous = Optional.ofNullable(anonymous);
		System.out.println(stringOptional);
		System.out.println(stringOptionalAnonymous);
		System.out.println(stringOptional.get());
//		System.out.println(stringOptionalAnonymous.get());

		// orElse
		String defaultOption = stringOptionalAnonymous.orElse("Stranger");
		System.out.println(defaultOption);

		// orElseGet
		String defaultOptionTwo = stringOptionalAnonymous.orElseGet(() -> "Stranger");
		System.out.println(defaultOptionTwo);

		// orElseThrow
		String defaultOptionThree = stringOptional
				.orElseThrow(() -> new IllegalArgumentException("Name Doesn't Exist"));
		System.out.println(defaultOptionThree);

		// ifPresent
		Optional<String> gender = Optional.of("MALE");
		Optional<String> empty = Optional.empty();

		// ifPresent
		gender.ifPresent((s) -> System.out.println("Value Is Prsent"));
		empty.ifPresent((s) -> System.out.println("No Value Is Prsent"));

		// isPresent
		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		} else {
			System.out.println("No Value Present");
		}
	}

}
