package com.student.marks;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [] marks =new int[5];
		System.out.println("Enter your marks for "+marks.length+" subjects");
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			
			marks[i]=s.nextInt();
			System.out.println(  "["+(i+1)+"]"+" marks: "+marks[i]);
			total+=marks[i];
			System.out.println("Remaining Subject = "+ (marks.length-(i+1)));
			
		}
		System.out.println("Average of result = "+total/marks.length);
	}

}
