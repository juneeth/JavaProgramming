package sample_exmaple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int [] sorting= {20,10,30,27,60};
		Arrays.sort(sorting);
		for(int i=0;i<sorting.length;i++)
		{
			System.out.println(sorting[i]);	
		}
		
		System.out.println("After");
		System.out.println(Arrays.toString(sorting));
		
		//Arraylist 
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(0, "welcome to Position 1");
		list.add(1,"welcome to postion 2");
		list.add(2, null);
		list.add(3, "postion 3");
		for(Object a:list)
		{
			System.out.println(a);
		}

		list.remove(2);
		
		for(Object a:list)
		{
			System.out.println(a);
		}
		
		//HashMap
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(100, "Juneeth");
		hm.put(200, "Alam");
		
		System.out.println(hm.entrySet());
		
		
		

	}

}
