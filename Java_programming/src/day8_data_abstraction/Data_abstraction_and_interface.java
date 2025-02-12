package day8_data_abstraction;

/*
1.  An interface is blue print of the class.
2.	Interface contain static and final variables(no need to specify , when we create a variables by default it is like that)
3.	Interface contains abstract methods (void m();) default and static method is allowed from Java 8
4.	An abstract method is a method that contain signature but not body (unimplemented methods)
5.	Methods in interface are public.
6.	Supports the functionality of the multiple inheritance.
7.	We can define interface with interface keyword.
8.	A class extends another class , an interface extends another interface , but class implement a interface.
9.	We can create object reference for interface but we cannot instantiate interface  
*/
interface shape
{
	int length = 20; // point 2 interface contains static and final variable by default so instantiation becomes must
	int width=30;
	int radius=10;
	
	void circle();  // abstract method point 4 contain signature but unimplemented body
	
	default void rectangle() // in interface we can introduce the default and static method as said in point 3
	{
		System.out.println("This method is the default ----rectangle method from the interface");
	}
	
	static void square()
	{
		System.out.println("This method is the static --- sqaure method from the square");
	}
	
}
public class Data_abstraction_and_interface implements shape
{
	//implementation of the abstract method
	public void circle()
	{
		double area=(2*3.14*radius);
		System.out.println("Hi see the class has implemented the method circle from the interface");
		System.out.println("The area of the circle is "+area);
		
	}
	
	void triangle()
	{
		System.out.println("This is the method from the class ---- triangle");
	}
	

	public static void main(String[] args) 
	{
		// let create a object for the class and see what are all the variable and method we can access using the class object
		Data_abstraction_and_interface da= new Data_abstraction_and_interface();
		da.circle();// abstract method
		da.rectangle();//default method
		shape.square(); // static method called using the interface name
		da.triangle(); // method in the class
		int sum=da.length+da.width+da.radius;
		System.out.println("The sum of the width, radius and width: "+sum);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Below are the output of the reference variable of the interface");
		
		//Lets create the interface reference object(instantiation is not possible here for interface)
		shape sh=new Data_abstraction_and_interface();  // reference object for the interface
		sh.circle(); // abstract method
		sh.rectangle(); // default method
		shape.square();//static method called using interface name , so here we could not be able to call the method in the implemented class ,so this is how we have achieved the data abstraction
		int interfaceadd=sh.length+sh.radius+sh.width;
		System.out.println("The sum of the 3 is "+interfaceadd);
	}

}
