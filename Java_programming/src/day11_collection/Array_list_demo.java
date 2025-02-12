package day11_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_list_demo {

	public static void main(String[] args)
	{
		//declaration of the array list using the 2 type 
		ArrayList mylist=new ArrayList();
		//List list =new ArrayList();
		
	//1. adding the element in to the array list 
		
	    mylist.add("Welcome_java");
	    mylist.add(100);
	    mylist.add(10.50);
	    mylist.add(1000);
	    mylist.add('A');
	    mylist.add(true);
	    System.out.println("The size of the arraylist is : "+mylist.size());
	    System.out.println("--------------------------------------------------");
	    
	 //2. printing the arraylist
	    System.out.println(mylist);
	    System.out.println("--------------------------------------------------");
	    
	 //3. removing the element from the array list
	    mylist.remove(1);
	    System.out.println("After removing the element from the arraylist :"+mylist);
	    System.out.println("--------------------------------------------------");
	    
	 //4. getting the single element from the list using the index
	    Object get=mylist.get(3);
	    System.out.println(mylist);
	    System.out.println("i have got the element and it has "+get);
	    System.out.println("--------------------------------------------------");
	    
	 //5.setting the single element from the list using the index
	    mylist.add(0, "selenuim with java");
	    System.out.println(mylist);
	    System.out.println("--------------------------------------------------");
	    
	 //6. printing the every element using the for loop
	    for(int i=0;i<mylist.size();i++)
	    {
	    	System.out.println("The element at the position "+(i+1)+" "+mylist.get(i));
	    }
	    
	    //7. printing the every element using for each loop
	    System.out.println("Printing using the for each loop");
	    int a=0;
	    for(Object a1:mylist)
	    {
	    	System.out.println("The element at the position "+a+" "+a1);
	    	a++;
	    }
	    //8.printing the element using the iterator
	    
	    Iterator it=mylist.iterator();
	    		while (it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	   	    
	    
	   
	}

}
