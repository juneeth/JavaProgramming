package sample_exmaple;

import java.util.Scanner;

import javax.swing.text.Position;

public class FindingLargestNumFromArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please Enter the value of array at array Position "+(i+1));
			a[i]=sc.nextInt();
		}
		
		int maxnum=a[0];
		int position=0;
		for(int b=0;b<a.length;b++)
		{
			if(a[b]>maxnum)
			{
				maxnum=a[b];
				position=b;
			}
		}
		System.out.println("The Largest Number in the Array is "+maxnum+" at array position: "+(position+1));
		
		

	}

}
