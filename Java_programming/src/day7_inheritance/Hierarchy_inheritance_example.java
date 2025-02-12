package day7_inheritance;

class parent
{
	void p1(int a)
	{
		System.out.println("I am parent Class and the value passed is : "+a);
	}
}
class child1 extends parent
{
	void c1(int a)
	{
		System.out.println("I am child 1 extend also the parent and the vlaue is: "+a);
	}
}

class child2 extends parent
{
	void c2(int a)
	{
		System.out.println("I am child 2 extend also the parent and the vlaue is:"+a);
	}
}
public class Hierarchy_inheritance_example {

	public static void main(String[] args) 
	{
		//this is hierarchy which extend the parent from child 1
		child1 c1=new child1();
		c1.p1(100);// parent extended by child 1
		c1.c1(200);
		child2 c2=new child2();
		c2.p1(400);//parent extended by child 2
		c2.c2(500);
	}

}
