package day_9_wrapper_class;

public class Wrapper_class {

	public static void main(String[] args) 
	{
	// auto-boxing - primitive type to object type
		
		int a=10;
		double b=20.5;
		float c=234.748f;
		
		Integer ai=a;
		Double bd=b;
		Float cc=c;
		
		System.out.println(ai);
		System.out.println(bd);
		System.out.println(cc);
		double add=ai+bd;
		
		//un-boxing - Object type to primitive type 
		
		int aobj=ai;
		double bobj=bd;
		float cobj=cc;	
		System.out.println("---------------------------------------------------------");
		System.out.println(aobj);
		System.out.println(bobj);
		System.out.println(cobj);
		
		
		//Scenario -1: stiring --> int , double , boolean , char
		//Scenario-2 : int , double , char , boolean --> String
		
	}

}
