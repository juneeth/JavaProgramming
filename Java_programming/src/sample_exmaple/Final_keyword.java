package sample_exmaple;

public class Final_keyword
{
	
	final int a=100;
	
	void run()
	{
		//a=400; //will get the error when we try to assign different value to the final variable a 
	}

	public static void main(String[] args)
	{
		Final_keyword fk=new Final_keyword();
		fk.run();
		System.out.println(fk.a);
	}
	
	}

