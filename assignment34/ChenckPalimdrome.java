package assignment34;

public class ChenckPalimdrome 
{   
	 public static void main(String args[])
	 {         
		   // str = "atul";
		   //String str = "SWATI";
		   String str = "MOM";
	        String rev = "";
	        
	        
	        for(int i = str.length()-1; i >= 0; i--)
	        {
	        	char ch = str.charAt(i);
	        	rev = rev + ch;
	        	
	        }
	       
	        System.out.println("String is :"+str);  
	        if(str.equals(rev))
	        {
	        	System.out.println("String is palimdrome");
	        }
	        else
	        {
	        	System.out.println("String is not palimdrome");
	        }
	 }
	 
	 
        
        
        
	
	
}
