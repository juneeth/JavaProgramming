package day7_inheritance;

class bank
{
	int interest()
	{
		return 7;
	}
}

class icici extends bank
{
	int interest()  // overriding the method by using the same signature but changing the statement alone
	{
		return 10;
	}
}

class hdfc extends bank
{
	int interest()
	{
		return 11;
	}
}

public class Overriding_concept {

	public static void main(String[] args) 
	{
/*We will have a method in the parent class,when we extend the parent method to the class ,
*  this method will also part of the child.So for some reason we need different implementation (statement or body). 
*  The return type , method name and argument will remain same.This is called overriding.
Super Keyword :
1.	Super keyword will call the immediate parent class variable even though it is overrided.
2.	Super keyword will call the immediate parent class Method even though it is overrided
3.	Super keyword will call the immediate parent class Constructor even though it is overrided
*/
		icici ic=new icici();
		int ret=ic.interest(); // since we have created the object for the icici class , we can able to call the icici overrided method.
		
		System.out.println(ret);
		bank ba=new bank();
		System.out.println(ba.interest());

	}

}
