package day10;

import java.util.Scanner;

public class Basic_exeption_handling {

	public static void main(String[] args) 
	{
		
		//Example1 arithmetic exception handling
		
		Scanner sc=new Scanner(System.in);
		System.out.println("The code has started .... hey i am very happy.........................");
		//System.out.println("Enter the number you want to divide 200 by ");
		/*int num=sc.nextInt();
		int divide=0;
		try 
		{
		 divide=(200/num); //Exception in thread "main" java.lang.ArithmeticException: / by zero
		 System.out.println("The answer for divide when 200 is divided by the given number by you is : "+divide);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data provided as a input ");
			String message=e.getMessage();
			System.out.println(message);
		}
		*/
		
		//System.out.println("The code has been completed Thank you!.................................");
		
		 int a[]=new int[3];
	     int position;
	     System.out.println("Please enter the position for the array");
	     position=sc.nextInt();
		 System.out.println("Enter the value for the position to be stored");
		try
		{
		 a[position]=sc.nextInt();  //  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
		 System.out.println("The value stored is printed: "+a[position]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Due to above error there was an error in the input provided by user , hence kindly change in next run");
		}
		 System.out.println("The code has been completed Thank you!.................................");
		}	
}
