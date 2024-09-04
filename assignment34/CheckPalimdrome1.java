package assignment34;
import java.util.*;

public class CheckPalimdrome1 
{
   public static void main(String arg[])
   {
	      Scanner sobj = new Scanner(System.in);
	      System.out.println("Original string is :");
	      String str  =  sobj.nextLine();
	      
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
