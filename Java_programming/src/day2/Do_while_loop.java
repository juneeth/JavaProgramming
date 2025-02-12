package day2;

public class Do_while_loop {

	public static void main(String[] args) {
		//printing the 1 to 10 number 
		int i= 1;
	/*	while(i<=10)
		{
			System.out.println("printing the value from 1 to 10 in the ascending order "+ i);
			i++;
		}
		*/
		// printing the even number from 1 to 10 
		int x=10;
		while(x>=1)
		{
		//	if(x%2!=0)
			if(!(x%2==0))
			{
				System.out.println("Printing the odd number from 1 to 10: " +x);
			    
			}
			else 
				System.out.println("Printing the even number from 1 to 10: "+x);
		
			x--;		
		}
		

	}

}
