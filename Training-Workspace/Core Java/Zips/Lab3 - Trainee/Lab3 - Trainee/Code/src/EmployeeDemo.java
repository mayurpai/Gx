public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}
	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		
		
	}
	public static void showData(Employee emp) {
		
		System.out.println("Emp Id : ");
		System.out.println("Name : ");
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : ");
		System.out.println("Addr Line2 : ");
		System.out.println("City : ");
		System.out.println("Pin : ");
		System.out.println("--------------------------------------------");

		
	}
}














