package day7_inheritance;

class A
{
	int a;
	void Class_A()
	{
		System.out.println("This is class A: " +a);
	}
}
//single inheritance example here 
	
class B extends A
{
	int b;
	void Class_B()
	{
		System.out.println("Classs B");
		System.out.println("This inherited class A :"+a);
		System.out.println("This is Class B: "+b);
	}
}
//here is the example of the Multi level inheritance
class C extends B
{
	int c;
	void Class_C()
	{
		System.out.println("Classs C");
		System.out.println("This inherited class A :"+a);
		System.out.println("This is Class B: "+b);
		System.out.println("This is Class C: "+c);
	}
}

public class Single_inheritance {	
	
	public static void main(String[] args) 
	{
		/*
		B b=new B();
		b.a=10;
		b.b=20;
		b.Class_A();
		b.Class_B();*/
		
		C c =new C();
		c.c=300;
		c.a=100;
		c.b=200;
		c.Class_A();
		c.Class_B();
		c.Class_C();

	}

}
