package day3;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String that you want to reverse and to check whether that is palindrome or not");
		String name =s.nextLine();
		String rev="";
		
		int slength=name.length();
		System.out.println("The length of the name is "+slength);
		for(int i=slength-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			//System.out.println(rev);
		}
		StringBuffer sb=new StringBuffer(name);
		StringBuffer reversed =sb.reverse();
		System.out.println("Reversed using the string Buffer: "+reversed);
		
		System.out.println("-----------------------------------");
		System.out.println("The entered name is :"+name);
		System.out.println("-----------------------------------");
		System.out.println("The reversed name is : "+rev);
		if (name.equals(rev))
		{
			System.out.println("The entered name is a palindrome");
		}
		else {
			System.out.println("The entered name is not a palindrome ");
		}
	}

}
