package con2;

public class getterandsetter 
{
private String name;
private int age;

public getterandsetter() //default constructor
{}
public getterandsetter(String name, int age )
{
	setName(name);
	setAge(age);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


	
	
	
}
