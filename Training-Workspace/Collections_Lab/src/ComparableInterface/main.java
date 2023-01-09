package ComparableInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import comparablecomparator.NameCompare;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(100, "AA", 23);
		Student s2 = new Student(2, "Ab", 33);
		Student s3 = new Student(6, "Ac", 1);
		Student s4 = new Student(4, "As", 55);
		
		List<Student> li = new LinkedList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		Collections.sort(li);
		for(Student s : li)
		{
			System.out.println(s.toString());
		}
	
		
		

	}

}
