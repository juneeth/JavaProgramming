package sample_exmaple;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args)
	{
		for(int i=1;1<=10;i++)
		{
			
			System.out.println(randomNumberGenerator());
			if(i==10)
			{
				break;
			}
			
		}
	}
	public static int randomNumberGenerator()
	{
		Random ran=new Random();
		int r=ran.nextInt(100);
	//	System.out.println(r);
		return r;
	}

}
