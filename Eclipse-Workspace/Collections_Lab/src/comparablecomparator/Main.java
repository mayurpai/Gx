package comparablecomparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(4, "aa", 21, 10000);
		Employee e2 = new Employee(5, "aa", 22, 5000);
		Employee e3 = new Employee(2, "ab", 19, 2000);
		Employee e4 = new Employee(1, "aa", 23, 3002);
		Employee e5 = new Employee(10, "ad", 23, 1000);
		
		List<Employee> li = new LinkedList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		
		Collections.sort(li);
		for(Employee e : li)
		{
			System.out.println(e.toString());
		}
		System.out.println("--------------------------------------");
		
		
		NameCompare nc = new NameCompare();
		Collections.sort(li,nc);
		for(Employee e : li)
		{
			System.out.println(e.toString());
		}
		System.out.println("-----------------");
		
		SalaryComparator sc = new SalaryComparator();
		Collections.sort(li,sc);
		for(Employee e : li)
		{
			System.out.println(e.toString());
		}
	}

}
