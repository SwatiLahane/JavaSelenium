package assignment49;

import java.util.*;

public class StringOutOfBoundException {

	 //Reverse a string 
	public static void main(String[] args)
	{
		 
	     	    String input = "Swati";
	    	    
	    	    //char Arr[] = str.toCharArray();
	    	    
	    	    String output = "";
	    		
	    		
	    		
	    		      
	    			 for(int i = 4 ; i >= 0; i--)
	    	    	   {
	    	    		   char c1 = input.charAt(i);
	    	    		 
	    	    		   output = output + c1;
	    	    
	    	    	   }
	    			  
	    			 try
	    			 {
		    			 System.out.println("Lenght of String "+input.length());
		    			 System.out.println(input.charAt(6));
	    			 
	    			 }
	    			 
	    			 catch( StringIndexOutOfBoundsException e)
	    			 {
	    				System.out.println("Exception Handled");
	    			 }
	    			 
	    			 
	    			 System.out.println("Rverse String is "+output );
	    		}
	    	    
        
  
	}


