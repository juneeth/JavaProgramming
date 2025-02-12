package sample_exmaple;

public class ContinueStatement {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		for(int b:a)
		{
			if(b==40)
			{
				System.out.println("before"+b);
				continue;
				//break;
				
			}
			System.out.println("After:"+b);
		}
		

	}

}
