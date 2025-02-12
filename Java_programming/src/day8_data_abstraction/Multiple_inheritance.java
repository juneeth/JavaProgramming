package day8_data_abstraction;

public class Multiple_inheritance implements Interface1,Interface2

{
	public void add()
	{
		System.out.println(a+b);
	}
	public void multiple()
	{
		System.out.println(c*d);
	}

	public static void main(String[] args) 
	{
		// This is the example of  the multiple inheritance using the interface1 and interface2
		Multiple_inheritance mi=new Multiple_inheritance();
		mi.add();
		mi.multiple();

	}

}
