package day4;

public class Different_type_method {
	 static int c=10;
	 static int d=20;
	//no parameter no return type
	void Method1()
	{
		System.out.println("This method is No parameter and No arguement");
	}
	//no parameter with return type
	int Method2()
	{
		return (c+d);
		//return ("no parameter with return type");
		
	}
	// with parameter but with no return type
	void Method3(int a, int b)
	{
		System.out.println("The addition of a: "+a+ "and b is "+b +" "+(a+b));
	}
	//with parameter and return type
	String Method4(String name)
	{
		return ("The given name is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Different_type_method obj=new Different_type_method();
		obj.Method1();
		int add=obj.Method2();
		System.out.println("The addition of c: "+c+" and d: "+d +" is "+ add);
		obj.Method3(100, 200);
		String name=obj.Method4("Juneeth");
		System.out.println(name);	

	}

}
