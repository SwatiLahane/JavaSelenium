package assignment59;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args)
	{   
		//ArrayList is class here is no need to do upcasting
		//
	   ArrayList l1 = new ArrayList();	//no casting we directly create object here
	    
	   
	    l1.add(12);
	    l1.add(200);
	    l1.add(300);
	    l1.add(300 );
	    l1.add("Swati");
	    l1.add("Swati");
	    l1.add(null); 
	    l1.add(null);
	    l1.add(null);
	    
	    System.out.println(l1);
	   
	    
	   Iterator i = l1.iterator();
	    
	    System.out.println("Forward iterator using Iterator ");
	      while(i.hasNext())  //hashnext return boolean
	       {
	    	 System.out.println(i.next()); //next return object
	       }
	    
	   
	    ListIterator li =  l1.listIterator();
	    
	    System.out.println("Forword Iteration using ListIterator");
	     while(li.hasNext())
	      {
	    	System.out.println(li.next());
	      }
	 
	    	
	    	
	    System.out.println("Backward Iteration using ListIterator"); 	
		  while(li.hasPrevious())
		   {
			   System.out.println(li.previous());
		   }
		  
	}
}

		  
