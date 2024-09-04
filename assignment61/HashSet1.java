package assignment61;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		
		 
	     HashSet Hs  = new	HashSet();
	     
	     Hs.add(12);
	     Hs.add(88);
	     Hs.add(23);
	     Hs.add(23);
	     Hs.add("Swati");
	     Hs.add("Swati");
	     Hs.add(null);
	     Hs.add(null);
	     Hs.add(null);
	     Hs.add("Shree"); 
	     System.out.println(Hs);
	     
	     Iterator i =  Hs.iterator();
	     
	     System.out.println("Forward Iteration");
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     
	  //Set Doesnt follow list iterator 
	}

}
