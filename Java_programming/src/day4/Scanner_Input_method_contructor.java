package day4;

import java.util.Scanner;

public class Scanner_Input_method_contructor {
	
	 String mname;
	 int mage;
	 int msal;
	
	 //Using the Method-1
	
	   void GetData(String name , int age, int sal)
	   {
		 //System.out.println(name); 
		 //System.out.println(age);  
		 //System.out.println(sal);
		  
		  mname=name;
		  mage=age;
		  msal=sal;
		   
	   }
	
	    void display()
	    {
	    	System.out.println("Printing using the method");
	    	System.out.println("The Name that user entered: " +mname); 
			System.out.println("The age that user entered is: " +mage);  
			System.out.println("The Salary that user enetered: " +msal);
			System.out.println("Printed the data using the Method");
			System.out.println("------------------------------------");
	    }
	    
	    //Getting and printing the input and output 
	    Scanner_Input_method_contructor(String name , int age, int sal)
	    {
	    	System.out.println("Printing the data using the constuctor");
	    	System.out.println("The Name that user entered: " +name); 
			System.out.println("The age that user entered is: " +age);  
			System.out.println("The Salary that user enetered: " +sal);
			System.out.println("Printed the data using the constuctor");
			System.out.println("------------------------------------");
	    }
/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Name:");
		String name =sc.nextLine();
		System.out.println();
		//System.out.println(name);
		System.out.println("Please enter the age:");
		int age=sc.nextInt();
		//System.out.println(age);
		System.out.println("Please enter the salary:");
		int salary=sc.nextInt();
		Scanner_Input_method_contructor obj=new Scanner_Input_method_contructor(name,age,salary);
		obj.GetData(name,age, salary);
		obj.display();
		*/
		
	}


