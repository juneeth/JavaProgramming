package sample_exmaple;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String want to reverse");
		String name=sc.next();
		String rev="";
		char a[]=name.toCharArray();
		System.out.println("After array :"+a);
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
		System.out.println();
		for(int i=name.length()-1; i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);

	}

}
