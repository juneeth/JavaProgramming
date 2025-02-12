package day_6_encapsulation_static_concept;

public class Static_Demo {
	
	// Static variable and non static Variables.
			static int a=10;
			int b=10;
			
			//static method 
			static void m1()
			{
				System.out.println("This is the static method ");
			}
			
			//non static Method 
			void m2()
			{
				System.out.println("This is the non static method");
			}
			
			//here we are trying to access the static method using the non static method 
			void m()
			{
				m1();//static method
				m2(); //non static method 
				
			}

	/*public static void main(String[] args) 
	{
		
		Static_Demo sc=new Static_Demo();
		// calling the non static method via the static method (main)
		System.out.println("Printing the non static variables b : "+sc.b);
		sc.m();
		sc.m2();
		
		//calling the static method via the static method
		
		System.out.println("printing the static varibale value a :"+a);
		m1();			

	}*/

}

