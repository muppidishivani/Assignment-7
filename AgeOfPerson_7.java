package com.web.java;

import java.util.Scanner;

public class AgeOfPerson_7 {

	
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("enter the year of birth ");
	        int by= scanner.nextInt();

	      
	        int cy = java.time.Year.now().getValue();
             System.out.println(cy);
	       
	        int age = cy - by;

	        System.out.println("The age of the person is=" + age + " years");

	    }
	
	}
