package sample_exmaple;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String ");
		String first=sc.next();
		System.out.println("Enter the second String ");
		String second=sc.next();
		compare(first, second);
	}
	public static void compare(String s1, String s2)
	{
		String s=null;
	//	if(s1.compareTo(s2)==0)
	//	if(s1.equals(s2))
		if(s1.contentEquals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equals");
		}
		//return s;
	}

}
