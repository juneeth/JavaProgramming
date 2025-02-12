package sample_exmaple;

import java.util.ArrayList;

public class ArrayList_Insertion_Example {

	public static void main(String[] args) 
	{
	
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("Adding object 1");
		ar.add("Adding Object 2");
		ar.add(2, "At Position 2");
		ar.add(1, "At Position 1");
		ar.add(0, "At Position 0");
		ar.add(3, "At Position 3");
		ar.add(6, "At Position 6");
		ar.add(5, "At Position 5");
		for(Object a:ar)
		{
			System.out.println(a);
		}
		/*
		 * output : 
		 * At Position 0 
		 * Adding object 1 
		 * At Position 1 
		 * Adding Object 2 
		 * At Position 2
		 */

	}

}
