package day_9_wrapper_class;

public class Data_Conversion {

	public static void main(String[] args) {
		//Scenario -1: string --> int , double , boolean , char  -- unboxing
	    //Scenario-2 : int , double , char , boolean --> String  -- auto boxing
		
		//string --> integer
		String s1="100";
		String s2="200";
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);// parseInt will convert the string to Integer from the Integer wrapper class.
		System.out.println(sum);// sum type is int
		
		//Scenario-2
		//String to double
		String s3="300.5";
		String s4="400.4564";
		double dsum=Double.parseDouble(s3)+Double.parseDouble(s4);
		System.out.println("Double Sum "+dsum);
		
		//scenario-3 string to boolean
		
		String s="true";
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		
	  //scenario-4 String to Char  is not possible because the parse Character is not available
		String sc="A";
		
		//Scenario2:
		//primitive to the object type int , double , char , boolean --> String
	     int i=100;
	     double d=200;
	     char c='C';
	     
	     String ii=String.valueOf(i);
	     System.out.println(ii);
		 String dd=String.valueOf(d);
		 System.out.println(dd);
		 String cc=String.valueOf(c);
		 System.out.println(cc);
		 
		 //Scenario-4 :int to double
		 int x=10;
		 double y=x;
		 int z=(int) y;
		 float zz=(int) x;
		 System.out.println(zz);
		 
		// converting the value in there type value
		 int j=(int) 10.45673;
		 System.out.println(j);
		 
		 float f=(float) 12.09876544556;// double to float
		 System.out.println(f);
		 
		 int li=(int)123456781234567f; // float to int conversion  f is literal used for long range in float type
		  
	}

}
