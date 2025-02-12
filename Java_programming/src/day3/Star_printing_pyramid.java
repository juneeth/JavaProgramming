package day3;

import java.util.Scanner;

public class Star_printing_pyramid {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String Name ;
		int age;
		int salary;
		System.out.println("Please enter your name ");
		System.out.println("Please enter your age ");
		System.out.println("Please enter your salary ");
		Name=sc.nextLine();
		
		salary=sc.nextInt();
		age=sc.nextInt();
		System.out.println("The Username is "+ Name);
		System.out.println("The age is "+ age);
		System.out.println("The Salry is "+ salary);
		

	}

}
