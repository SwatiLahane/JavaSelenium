package assignment35;
import java.util.*;

public class CountNumbers {

	public static void main(String[] args) 
	{     
		  int icount = 0;
	     Scanner sobj = new Scanner(System.in);
	     System.out.println("Enter String :");
	     String str = sobj.nextLine();
	     
	     
	     char Arr[] = str.toCharArray();
 	     
	     for(int i = 0 ; i < Arr.length; i++)
	     {
	    	if(Arr[i] >= '0' && Arr[i] <= '9')
	    	{
	    		icount++;
	    	}
	     }
	     System.out.println("Count of numbers in String "+icount);

	}

}
