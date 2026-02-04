package com.string.task;

import java.util.Scanner;

public class ConvertTitleCase {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String [] str1=str.split(" ");
		String string="";
		for(int i=0;i<str1.length;i++)
		{
			string+=titleCase(str1[i])+" ";
		}
		System.out.println(string);
		
	}
	public static String titleCase(String string)
	{
		  return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
	}
}
