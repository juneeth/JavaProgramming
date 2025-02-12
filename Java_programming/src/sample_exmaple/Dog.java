package sample_exmaple;

public class Dog extends Animal
{
	
		Dog()
		{
			super();
			//System.out.println("Dog class");
		}
		void blackdog()
		{
			System.out.println("Black dog method");
		}
	    
		void test()
		{
			super.blackdog();
			blackdog();
		}

}
