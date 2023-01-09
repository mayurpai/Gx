package com.java.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student studentOne, Student studentTwo) {
		if (studentOne.getAge() < studentTwo.getAge())
			return -1;
		if (studentOne.getAge() > studentTwo.getAge())
			return 1;
		else
			return 0;
	}

}
