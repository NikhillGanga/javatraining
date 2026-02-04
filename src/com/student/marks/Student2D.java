package com.student.marks;

import java.util.Scanner;

public class Student2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the student size :");
		int student1=s.nextInt();
		System.out.print("Enter the subject size :");
		int subject1=s.nextInt();
		int [][] studentMarks=new int[student1][subject1];
		
		for (int i=0;i<studentMarks.length;i++)
		{ 
			int student=i;
			System.out.println("enter the marks for student: "+(student+1));
			for (int j=0;j<studentMarks[0].length;j++)
			{
				studentMarks[i][j]=s.nextInt();
			}
				
			
		}
		for (int i=0;i<studentMarks.length;i++)
		{
			
			for (int j=0;j<studentMarks[0].length;j++)
			{
				System.out.print(studentMarks[i][j]+"\t");
				
			}
			System.out.println();
				
			
		}
		
		for (int i=0;i<studentMarks.length;i++)
		{
			int student=i;
			int total=0;
		    int avg=0;
			for (int j=0;j<studentMarks[0].length;j++)
			{
			total+=studentMarks[i][j];
			}
		    avg=total/studentMarks[0].length;
			System.out.println("Average marks of student "+(student+1)+": "+avg);
			System.out.println();
				
			
		}
		
	}
}
