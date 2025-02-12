package day4;

public class Method_para {

	String name;
	int age;
	int salary;
	
	void get_data(String name , int age ,int sal)
	{
		this.name=name;
		this.age=age;
		this.salary=sal;
	}
	//using the method
	void display()
	{
		System.out.println("The Entered name is "+name);
		System.out.println("The Entered age is "+age);
		System.out.println("The Entered Salary is "+salary);
	}	
	//using the constructor
	Method_para(String mname , int mage ,int msal)
	{
		name=mname;
		age=mage;
		salary=msal;
		System.out.println("The Entered name is "+name);
		System.out.println("The Entered age is "+age);
		System.out.println("The Entered Salary is "+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_para para=new Method_para("Alam" , 30 , 30000);//using the contructor
		para.get_data("Juneeth", 25, 25000); //used the method 
		para.display();	
		
	}

}
