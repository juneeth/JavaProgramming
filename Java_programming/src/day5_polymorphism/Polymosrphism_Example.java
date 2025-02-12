package day5_polymorphism;

public class Polymosrphism_Example {
	
	void m()
	{
		System.out.println("This is the default method");
	}
	
	void m(int a , int b)
	{
		int sum=a+b;
	    System.out.println("The sum of "+a +" and "+b+ "= "+sum);
	}
	
	void m(int a , double b)
	{
		double sum=a+b;
		System.out.println("The sum of " +a +" and "+" is "+sum);
		
	}
	
	void m(double a , double b)
	{
		double sum=a+b;
	    System.out.println("The sum of "+a +" and "+b+ " = "+sum);
	}
	
	void m(int a , int b , int c)
	{
		int sum=a+b+c;
	    System.out.println("The sum of "+a +" and "+b+ " and "+c +" is = "+sum);
	}

}
