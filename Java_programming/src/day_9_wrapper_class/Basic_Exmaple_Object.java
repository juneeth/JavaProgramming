package day_9_wrapper_class;

import java.util.Scanner;

public class Basic_Exmaple_Object {

	public static void main(String[] args) 
	{
		Object a[]=new Object[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the data at the position "+i);
			//System.out.println();
			a[i]=sc.next();
		}
		int p=0;

		for(Object obj:a)
		{
			System.out.println("The value entered as follows in the array :"+p+" "+obj);
			p++;
		}
	}

}
