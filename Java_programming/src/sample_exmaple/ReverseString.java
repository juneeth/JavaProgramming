package sample_exmaple;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String need to be reversed ");
		String input=sc.next();
		String reversed=reverse(input);
		System.out.println(reversed);
		
	}
	public static String reverse(String s)
	{
		/*
		 * String rev=""; String[] words=s.split("//s"); for(int
		 * a=words.length-1;a>=0;a--) { rev=rev+words[a]+""; }
		 * 
		 * return rev;
		 */
		StringBuffer buf=new StringBuffer(s);
		String su=buf.reverse().toString();
		return su;
	}

}
