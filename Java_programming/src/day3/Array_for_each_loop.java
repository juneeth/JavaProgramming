package day3;

public class Array_for_each_loop {

	public static void main(String[] args) 
	{
		int []ar= {10,20,30,40,50};
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		int a[]= new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		 
		int arraylength=a.length;
		System.out.println("The length of the array is "+arraylength);
		for(int x=0;x<arraylength;x++)
		{
			System.out.println("The Array value is as follow "+(x+1) + " is "+ a[x]);
		}
	}

}
