package comparablecomparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		if (!e1.getName().equals(e2.getName())) {
			System.out.println("if");
			return e1.getName().compareTo(e2.getName());
		} else {
			if (e1.getAge() != e2.getAge()) {
				System.out.println("else-if");
				return e1.getAge() - e2.getAge();
			} else {
				System.out.println("else-else");
				return e1.getSalary() - e2.getSalary();
			}
		}
	}
}
