package day7_inheritance;

// using this class Animal as a example of the super keyword usage and scope.
public class Animal
{
String color="white";
void eat()
{
	System.out.println("I am eating from parent class");
}

}

class dog extends Animal
{
	String color="red";// overriding variables
	void display()
	{
		System.out.println("The color of the animal is "+super.color);// super keyword is used to invoke the immediate parent class variable
	}
	void eat() // overriding the methods
	{
		super.eat();// this will call the immediate parent class method
		//System.out.println("I am eating from the child class");
	}
}