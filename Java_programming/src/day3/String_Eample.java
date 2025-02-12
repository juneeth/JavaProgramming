package day3;
import java.util.*;

public class String_Eample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to rever using the Char Array");
		String name=s.nextLine();
		String rev="";
		
		//Method-2:using the char array
		
		char a[]=name.toCharArray();
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=name.length()-1; i>=0;i--)
		{
			rev=rev+a[i];
		}

		System.out.println(rev);
		//using the Method String Buffer
		
		StringBuffer sb=new StringBuffer(name);
		StringBuffer print =sb.reverse();
		System.out.println("Printing the reverse of the string using the string Buffer: "+ print);
		
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		
	}

}
