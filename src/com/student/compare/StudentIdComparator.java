package com.student.compare;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

	    int idCompare = Integer.compare(o1.getId(), o2.getId());
	    if (idCompare != 0) {
	        return idCompare;
	    }

	    return Integer.compare(o1.getAge(), o2.getAge());
	}

}
