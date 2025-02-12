package day4;

import java.util.Scanner;

public class Scanner_Input_method_contructor_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
