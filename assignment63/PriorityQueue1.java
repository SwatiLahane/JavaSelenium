package assignment63;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class PriorityQueue1 {

	public static void main(String[] args)
	{
		
		PriorityQueue<Integer> pq =new  PriorityQueue<Integer>();
		
		    pq.add(12);
		    pq.add(5);
		    pq.add(133);
		    pq.add(144);
		    pq.add(245);
		    pq.add(245); 
		    
		    /*pq.add(null);
		    pq.add(null);
		    pq.add(null);
		    pq.add("Swati"); */ 
		    System.out.println(pq);
		    
		    
		    
		    Iterator i =  pq.iterator();
		    System.out.println("Forward Iteration");
			   
			   while(i.hasNext())
			   {
				   System.out.println(i.next());
			   }
			  
			   
			
		       
	}

}
