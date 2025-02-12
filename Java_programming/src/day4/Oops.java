package day4;

public class Oops {
	
	String name;
	int age;
	int salary;
	
	void display()
	{
		System.out.println("The Entered name is "+name);
		System.out.println("The Entered age is "+age);
		System.out.println("The Entered Salary is "+salary);
	}
	
	public static void main(String[] args)
	{
		Oops ops=new Oops();
		ops.name="Juneeth";
		ops.age=25;
		ops.salary=25000;
		
		ops.display();
	}

}
