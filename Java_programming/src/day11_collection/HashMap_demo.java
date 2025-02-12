package day11_collection;

import java.util.HashMap;

public class HashMap_demo {

	public static void main(String[] args) 
	{
		// hash map is the collection 
		/* Java HashMap contains values based on the key.
           Java HashMap contains only unique keys.
           Java HashMap may have one null key and multiple null values.
           Java HashMap is non synchronized.
           Java HashMap maintains no order.
           The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.*/
		   HashMap<Integer , String> hm= new HashMap<Integer , String>();
		   hm.put(101 , "Juneeth");
		   hm.put(102, "Alam");
		   hm.put(103, "Jeffrin");
		   hm.put(104, "aravind");
		   
		   System.out.println(hm); //{101=Juneeth, 102=Alam, 103=Jeffrin, 104=aravind}
		   System.out.println(hm.entrySet()); //[101=Juneeth, 102=Alam, 103=Jeffrin, 104=aravind]
		   System.out.println(hm.keySet()); //[101, 102, 103, 104]
		   System.out.println(hm.values());  //[Juneeth, Alam, Jeffrin, aravind]
		   
		   hm.remove(103);
		   System.out.println(hm);//{101=Juneeth, 102=Alam, 104=aravind}

	}

}
