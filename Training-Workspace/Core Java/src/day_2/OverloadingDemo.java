package day_2;

public class OverloadingDemo {

	public void add() {
		int numberOne = 3;
		int numberTwo = 2;
		System.out.println("Add Without Parameter " + (numberOne + numberTwo));
	}

	public void add(int numberOne, int numberTwo) {
		System.out.println("Add With Parameter " + (numberOne + numberTwo));
	}

	public void add(int... numbers) {
		int sum = 0;
		for (int i:numbers) {
			sum += i;
		}
		System.out.println("Add With * " + (sum));
	}

	public void admitPatient(String patientName, String symptoms) {
		System.out.println("Patient Name: " + patientName);
		System.out.println("Symptoms: " + symptoms);
		System.out.println("=============================================");
	}

	public void admitPatient(String patientName, String symptoms, String doctorName) {
		System.out.println("Patient Name: " + patientName);
		System.out.println("Symptoms: " + symptoms);
		System.out.println("Doctor: " + doctorName);
		System.out.println("=============================================");
	}

	public static void main(String[] args) {
//		System.out.println("Mayur");
//		System.out.println('M');
//		System.out.println(5);
		OverloadingDemo od = new OverloadingDemo();
		od.add();
		od.add(5, 4);
		od.add(1);
		od.add(1, 2, 3, 4, 5);
		od.admitPatient("A", "Cold");
		od.admitPatient("B", "Cough", "Z");
	}

}
