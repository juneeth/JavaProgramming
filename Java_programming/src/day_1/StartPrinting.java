package day_1;

import java.util.Iterator;
import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class StartPrinting {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
	    star(row);
	/*	for(int i=0;i<=5;i++)
		{
			if(i==4)
			{
				System.out.println("before "+i);
				continue;
			}
		}*/
	}
	

	public static void star(int row) 
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


