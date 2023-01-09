package day_3;

public class Employee {

	int num = 10;
	{
		// Instance Block Is Called Every Time An Object Is Created
		System.out.println("3. Instance Block");
	}

	static {
		// Static Block Is Called Even Before Main And Will Be Called Only Once
		System.out.println("1. Static Block");
	}

	public Employee() {
		this.num = 40;
		System.out.println("4. Default Constructor Called");
	}

	public void display() {
		System.out.println("Display Called");
	}

	public static void main(String[] args) {
		System.out.println("2. Main Called");
		Employee employeeOne = new Employee();
		Employee employeeTwo = new Employee();
		new Employee(); // Memory Allocation Without Any Name
		new Employee().display();
	}

}
