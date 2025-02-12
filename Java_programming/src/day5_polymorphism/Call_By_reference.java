package day5_polymorphism;

public class Call_By_reference 
{
    int number;
    
    void main(Call_By_reference t)
    {
    	t.number=t.number+100;
    	System.out.println("While executing the method "+t.number);
    	
    }
	
	
}
