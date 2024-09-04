package assignment52;

import java.util.Collections;
import java.util.Vector;

import java.util.*;

public class Vector2 {

	public static void main(String[] args)
	{
	   
		Vector<Integer> v =new Vector<Integer>();
		
		v.add(12);
		v.add(100);
		v.add(200);
		v.add(300);
		
		//v.addfirst(5);
		
		Collections.sort(v);
		System.out.println(v);
		
		if(v.contains(200))
		{
			System.out.println("Vector Contains 200 in it");
		}
		else
		{
			System.out.println("Vector Doesnt contains 200 in it");
		}
		  
		System.out.println("Forward Iteration :");
	       Iterator i1 = v.iterator();
	       
	       while(i1.hasNext())
	       {
	    	   System.out.println(i1.next());
	       }
	       
	       
	       System.out.println("Forward Iteration using list Iterator :");
	       ListIterator l1 = v.listIterator();
	       
	       while(l1.hasNext())
	       {
	    	   System.out.println(l1.next());
	       }
	       
	       
	System.out.println("Backward Iteration using list Iterator :");
 
	       while(l1.hasPrevious())
	       {
	    	   System.out.println(l1.previous());
	       }  
	       
	       
	}		
	
	

}
