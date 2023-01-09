package com.employee.comparator;

import java.util.Comparator;

import com.employee.entity.Employee;

public class SortByNameAscending implements Comparator<Employee> {

	@Override
	public int compare(Employee objectOne, Employee objectTwo) {
		if (objectOne.getEmployeeName().compareTo(objectTwo.getEmployeeName()) > 0)
			return 0;
		else
			return -1;

	}

}
