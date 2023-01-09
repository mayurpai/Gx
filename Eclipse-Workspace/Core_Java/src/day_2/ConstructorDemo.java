package day_2;

class Employee {
	int employeeId;
	String employeeName;
	int age = 20;
//	static int age = 20;

	public Employee() {
//		super();
		System.out.println("Employee Default Constructor");
		this.employeeId = -1;
		this.employeeName = "NA";
	}

	public Employee(int employeeId, String employeeName) {
		this();
		System.out.println("Employee Parameterized Constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee(int employeeId) {
//		this("Mayur Pai B H");  
//      Can Be Used To Write The Data Into A Particular Object
		this();
		System.out.println("Employee 1 Argument Constructor For Employee ID");
		this.employeeId = employeeId;
	}
	
	public Employee(String employeeName) {
		this();
		System.out.println("Employee 1 Argument Constructor For Employee Name");
		this.employeeName = employeeName;
	}

	public void display() {
//		int age = 40;
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("====================================");
//		System.out.println("Age: " + age);
//		System.out.println("This Age : " + this.age);
	}

	public void change() {
		employeeName = "Mayur Pai";
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Employee e_1 = new Employee();
		Employee e_2 = new Employee(100, "Mayur");
		Employee e_3 = new Employee(150);
		Employee e_4 = new Employee("Nagendra");
//		Employee.age = 45;
//		System.out.println(Employee.age);
		e_1.display();
		e_2.change();
		e_2.display();
		e_3.display();
		e_4.display();
	}

}
