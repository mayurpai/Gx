package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return Objects.equals(address, student.address) && age == student.age && Objects.equals(name, student.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Student student) {
		return (this.name.compareTo(student.name));
	}

	public static void main(String[] args) {
		Student mayur = new Student("Mayur", 23, "Mangalore");
		Student reshma = new Student("Reshma", 19, "Mangalore");
		Student kavya = new Student("Kavya", 22, "Bangalore");
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(mayur);
		studentList.add(reshma);
		studentList.add(kavya);
		Collections.sort(studentList);

		studentList.forEach(student -> System.out.println(student.getName()));
		System.out.println(studentList);
	}

}
