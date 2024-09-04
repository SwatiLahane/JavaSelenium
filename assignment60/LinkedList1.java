package assignment60;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args)
	{
		LinkedList li = new LinkedList();
		
		 li.add(12);
	     li.add(88);
	     li.add(23);
	     li.add(23);
	     li.add("Swati"); 
	     li.add("Swati");
	     li.add(null);
	     li.add(null);
	     li.add(null);
	     li.add("Shree");
	     
	     
	    // Collections.sort(li);
	     
	     System.out.println(li);
              
	       
	     Iterator i = li.iterator();
	     System.out.println("Forward Iteration");
		  while(i.hasNext())
		  {
			  System.out.println(i.next());
		  }
		  
		  ListIterator li1   = li.listIterator();
		  System.out.println("Forward Iteration using List Iterator");
		  while(li1.hasNext())
		  {
			  System.out.println(li1.next());
		  }
		  
		  System.out.println("Backward Iteration using ListIterator"); 	
		  while(li1.hasPrevious())
		   {
			   System.out.println(li1.previous());
		   }
		  
		  
	     
	     
	}

}
