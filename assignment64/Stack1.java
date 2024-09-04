package assignment64;

import java.util.Stack;

import java.util.*;
public class Stack1 {

	public static void main(String[] args) 
	{
	       //stack is relation with class
		Stack s1 = new Stack(); //object no casting
		
		    s1.add(12);
		    s1.add(200);
		    s1.add(300); 
		    s1.add(300 );
		    s1.add("Swati");
		    s1.add("Swati");
		    s1.add(null);
		    s1.add(null);
		    s1.add(null);
		    
		   // Collections.sort(s1);
		    System.out.println(s1);
		  //  System.out.println(s1.pop());
		    
		   Iterator i = s1.iterator();
		   System.out.println("Forward Iteration");
		   
		   while(i.hasNext())
		   {
			   System.out.println(i.next());
		   }
		
		   ListIterator li= s1.listIterator();
		   
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
