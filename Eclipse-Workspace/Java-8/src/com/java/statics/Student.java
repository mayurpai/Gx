package com.java.statics;

public class Student {

	private String name;
	private int age;
	private String address;
	private static String companyName = "GalaxE Solutions";
	private static int count = 0;

	static {
		System.out.println("Static Block");
	}

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		count += 1;
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

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Student.companyName = companyName;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public static void main(String[] args) {
		Student mayur = new Student("Mayur", 23, "Mangalore");
		Student mayur1 = new Student("Mayur", 23, "Mangalore");
		Student mayur2 = new Student("Mayur", 23, "Mangalore");
		System.out.println(mayur);
		System.out.println(mayur.getName());
		System.out.println(mayur.getAge());
		System.out.println(mayur.getAddress());
		System.out.println(Student.getCount());
	}

}
