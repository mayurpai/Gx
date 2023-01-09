package com.java.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/* 
 * Stream Represents  Sequence Of Objects From A Source, Which Supports Aggregate Operations. 
 * It Consists Of Classes, Interface, And An Enum To Allow Functional-Style Operations On The Elements. */

/* How Stream Works: Source -> Filter -> Sort -> Map -> Collect */
public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> numbersList = new ArrayList<>();

		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);

		List<Integer> squaresList = new ArrayList<Integer>();
		for (Integer i : numbersList)
			squaresList.add(i * i);
		System.out.println(squaresList);

		List<Integer> squaresListUsingStream = numbersList.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(squaresListUsingStream);

		Set<Integer> squareSet = new HashSet<>();
		for (Integer i : numbersList)
			squareSet.add(i * i);
		System.out.println(squareSet);

		Set<Integer> squareSetUsingStream = numbersList.stream().map(i -> i * i).collect(Collectors.toSet());
		System.out.println(squareSetUsingStream);

		List<String> programmingLangauges = new ArrayList<>();

		programmingLangauges.add("Java");
		programmingLangauges.add("GO");
		programmingLangauges.add("Python");
		programmingLangauges.add("C");

		List<String> filteredResults = new ArrayList<>();
		for (String filterResult : programmingLangauges) {
			if (filterResult.startsWith("J")) {
				filteredResults.add(filterResult);
			}
		}
		System.out.println(filteredResults);

		List<String> filteredResultsUsingStream = programmingLangauges.stream().filter(s -> s.startsWith("J"))
				.collect(Collectors.toList());
		System.out.println(filteredResultsUsingStream);

		List<String> sortedListUsingStream = programmingLangauges.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedListUsingStream);

		programmingLangauges.stream().forEach(i -> {
			System.out.println(i);
		});

		Integer sum = numbersList.stream().map(i -> i).reduce(0, (a, c) -> a + c);
		System.out.println(sum);

		Map<Integer, Person> map = new HashMap<Integer, Person>();
		List<Person> person = new ArrayList<Person>();

		Person personOne = new Person("Mayur", 22);
		Person personTwo = new Person("Reshma", 19);

		person.add(personOne);
		person.add(personTwo);

		map.put(1, personOne);
		map.put(2, personTwo);

		for (Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().getName());
		}

		person.stream().forEach((persons) -> {
			System.out.println(persons.getName() + " " + persons.getAge());
		});
	}

}
