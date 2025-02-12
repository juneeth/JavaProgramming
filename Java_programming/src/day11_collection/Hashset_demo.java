package day11_collection;

import java.util.HashSet;

public class Hashset_demo {

	public static void main(String[] args)
	{
		//hashset is heterogeneous , it does not follow index(insertion order) ,does not allow duplicate 
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("wlecome to hashset");
		hs.add(100);
		hs.add(200);
		hs.add('A');
		System.out.println("printing the element "+hs);//[A, 100, wlecome to hashset, 200]
		//printing the size		
		System.out.println("printing the size of the hashset: "+hs.size());
		
		// removing the element
		hs.remove(100);
		System.out.println("printing after removing single from hashset "+hs);//[A, wlecome to hashset, 200]
		
		
		

	}

}
