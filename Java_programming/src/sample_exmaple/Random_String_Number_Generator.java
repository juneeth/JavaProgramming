package sample_exmaple;

import java.util.Random;

public class Random_String_Number_Generator {

	public static void main(String[] args) 
	{
		Random_String_Number_Generator rst=new Random_String_Number_Generator();
		for(int a=0;a<=10;a++)
		{
		String print=rst.RandomString();
		System.out.println(print);
		// Generating Number using the for loop
		int printnum=rst.RandomInteger();
        System.out.println(printnum); 
		
		}
		
	}
	//Random String Generator
	public static String RandomString()
	{
	String s="QWERTYUIOPASDFGHJKLZXCVBNM";
	StringBuilder sb=new StringBuilder();
	Random r=new Random();
	String ranstr="";
	for(int i=0;i<=10;i++)
	{
	int index=r.nextInt(s.length());
	char ch=s.charAt(index);
	sb.append(ch);
	}
	ranstr=sb.toString();
	return ranstr;
	}
	
	public static int RandomInteger()
	{
		Random r=new Random();
		int a=r.nextInt(1000);
		return a;
	}

}
