package sample_exmaple;

public class Encapsulation_demo {
	static int a=10;
	int b=20;
	
	int add(int a , int b)//not static
	{
		int c=a+b;
		return c;
	}
	
	static int sub(int a, int b ) //static
	{
		int c=a-b;
		return c;
	}
	
	void calculator() // non static (calling the static and non static method using the non static method)
	{
		System.out.println(add(500, 80));
		System.out.println(sub(600, 10));
			
	}
	
	public static void main(String[] args) 
	{
		
		Encapsulation_demo ed=new Encapsulation_demo();
		System.out.println("Calling the non static variable b : "+ed.b);
		System.out.println("Calling the static variable: "+a);
		System.out.println("static Main with static method: "+sub(100, 20)); //static main method access the static method without any object
		System.out.println("static Main with Non-static method add: "+ed.add(200, 100));
		ed.calculator();
	

	}

}
