package assignment52;

import java.util.*;
public class Vector1 {

	public static void main(String[] args) 
	{
	   
		//Vector accept Duplicate 
		//Vector Accept More than 1 Null Value
		//It Follows Indexing
		//It follows the Insertion value 
		//It does not sort 
		//It Follows Iterator 
		
		Vector v =new Vector();
		
		v.add(12);
		v.add(12);
		v.add("Swati");
		v.add("Saksi");
		v.add("Swati");
		v.add(null);
		v.add(null);
		v.add(null);
		
		//Collections.sort(v);
		System.out.println(v);
		
		//Iterator
		System.out.println("Forword Iteration");
		//Iterator only do forwar iteration
		
		Iterator i1 = v.iterator();
	       
	       while(i1.hasNext())
	       {
	    	   System.out.println(i1.next());
	       }
	       
	       System.out.println("Forword Iteration for List Iterator");
	       ListIterator l1 = v.listIterator() ;
	       while(l1.hasNext())
	       {
	    	   System.out.println(l1.next()); 
	       }
	       
	       System.out.println("Backward Iteration for List Iterator");

	    	
	       while(l1.hasPrevious())
	       {
	    	   System.out.println(l1.previous());
	    	   
	       
	       }
		
		
	}

}
