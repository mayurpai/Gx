package com.java.equalsandhashcodes;

import java.util.Objects;

public class Student {

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

	public static void main(String[] args) {
		Student mayur = new Student("Mayur", 23, "Mangalore");
		Student mayurPai = new Student("Mayur", 23, "Mangalore");
		System.out.println(mayur.equals(mayurPai));
	}

}
