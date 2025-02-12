package sample_exmaple;

import java.util.ArrayList;

public class ChallengeBala {

	public static void main(String[] args)
	{
      ArrayList<String> weeks=new ArrayList<String>();
      weeks.add("Sunday");
      weeks.add("Monday");
      weeks.add("Tuesday");
      weeks.add("wednesday");
      weeks.add("Thursday");
      weeks.add("Friday");
      weeks.add("saturday");
		
		/*
		 * for(String a:weeks) { System.out.println("Array list has:" +a); }
		 */
      
      for(String b: weeks)
      {
    	  if(b.equals("Friday"))
    	  {
    		  System.out.println(b);
    	  }
    	
    	 
      }
      
      for(int a=1;a<=5;a++)
      {
    	  for(int b=1;b<=a;b++)
    	  {
    		  System.out.print(b);
    	  }
    	  System.out.println();
      }
		
		
		
		
	}

}
