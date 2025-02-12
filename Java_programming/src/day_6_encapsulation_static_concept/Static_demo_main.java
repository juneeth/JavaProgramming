package day_6_encapsulation_static_concept;

public class Static_demo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Demo sc=new Static_Demo();
		// calling the non static method via the static method (main)
		System.out.println("Printing the non static variables b : "+sc.b);
		sc.m();
		sc.m2();
		sc.m1();
		
		//calling the static method via the static method
		
		System.out.println("printing the static varibale value a :"+Static_Demo.a); //when the main is in different class we need to add the class name 
		Static_Demo.m1();		

	}

}
