package day3;

import java.util.Scanner;

public class Find_value_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array you want");
		int arraylength=s.nextInt();
		int a[]=new int[arraylength];
		for(int i=0;i<arraylength;i++)
		{
			System.out.println("Enter the value you want to insert in to the array at postion "+(i+1) +" :");
			a[i]=s.nextInt();
		}
		for(int j=0;j<arraylength;j++)
		{
			System.out.println("The value enter at the position in the arrary is "+(j+1)+": "+a[j]);
		}
		
		System.out.println("Let search the value from the array ................................");
		System.out.println("Enter the search value : ");
		int search_num=s.nextInt();
		boolean status=false;
		for (int k=0;k<arraylength;k++)
		{
			if(a[k]==search_num)
			{
				System.out.println("Yeah we have finded the search value : "+search_num +" at array position :"+(k+1));
				System.out.println("Element founded Bye See you");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("The search Element "+""+search_num+" is not founded from the array ...Thanks!");
		}
		
	}

}
