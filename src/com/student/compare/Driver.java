package com.student.compare;

import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Set<Student> studSet=new TreeSet<Student>(new StudentIdComparator());
		studSet.add(new Student(103,"Yashasvi",23));
		studSet.add(new Student(101,"Nikhil",12));
		studSet.add(new Student(101,"Vishal",3));
		
		
		
		for(Student s:studSet)
		{
			System.out.println(s);
		}
		
	}

}
