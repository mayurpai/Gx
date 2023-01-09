package com.java.classes;

public class Student {

	String name;
	int age;
	String address;

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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
		System.out.println(mayur.getName());
		System.out.println(mayur.getAge());
		System.out.println(mayur.getAddress());
		System.out.println(mayur);
	}

}
