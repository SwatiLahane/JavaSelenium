package assignment62;

import java.util.Vector;
import java.util.*;

public class VectorProgram {

	public static void main(String[] args)
	{
		   
		 Vector vi =new  Vector();
		 
		    vi.add(12);
		    vi.add(200);
		    vi.add(300);
		    vi.add(300 );
		    vi.add("Swati");
		    vi.add("Swati");
		    vi.add(null); 
		    vi.add(null);
		    vi.add(null);
		    
		   System.out.println(vi);
		    
		   Iterator i = vi.iterator();
		   
		   System.out.println("Forward Iteration");
		  while(i.hasNext())
		  {
			  System.out.println(i.next());
		  }
		  
		  ListIterator li   = vi.listIterator();
		  System.out.println("Forward Iteration using List Iterator");
		  while(li.hasNext())
		  {
			  System.out.println(li.next());
		  }
		  
		  System.out.println("Backward Iteration using ListIterator"); 	
		  while(li.hasPrevious())
		   {
			   System.out.println(li.previous());
		   }
		  
		  System.out.println("Iteration using Enumeration"); 	

		  Enumeration eobj = vi.elements();
		  while(eobj.hasMoreElements())
		  {
			  System.out.println(eobj.nextElement());
		  }
		  
		  
		  
	}

}
