package sample_exmaple;

import java.util.Arrays;

public class ManualArraySorting {

	public static void main(String[] args) 
	
	{
	int sor[]=new int[] {1,40,9,24,46,62,79,81};
	int temp=0;
	 
	//Displaying elements of original array    
    System.out.println("Elements of original array: ");    
    for (int i = 0; i < sor.length; i++)
    {     
        System.out.print(sor[i] + " ");    
    }    
    System.out.println();
	
	//Using the build in method to sort the array
    Arrays.sort(sor);
    System.out.println(Arrays.toString(sor));
		
	//Using the manual logic to sort the array
   //Sort the array in ascending order    
    for (int i = 0; i < sor.length; i++) {     
        for (int j = i+1; j < sor.length; j++) {     
           if(sor[i] > sor[j]) {    
               temp = sor[i];    
               sor[i] = sor[j];    
               sor[j] = temp;    
           }     
        }     
    }    
    //Displaying elements of array after sorting    
    System.out.println("Elements of array sorted in ascending order: ");    
    for (int i = 0; i < sor.length; i++) 
    {     
        System.out.print(sor[i] + " ");    
    }    
    
    
    //Sort the array in descending order    
    for (int i = 0; i < sor.length; i++) {     
        for (int j = i+1; j < sor.length; j++) {     
           if(sor[i] < sor[j]) {    
               temp = sor[i];    
               sor[i] = sor[j];    
               sor[j] = temp;    
           }     
        }     
    }   
    System.out.println();
    //Displaying elements of array after sorting  in descending order  
    System.out.println("Elements of array sorted in descending order: ");    
    for (int i = 0; i < sor.length; i++) 
    {     
        System.out.print(sor[i] + " ");    
    }    
    
    
	}
}
