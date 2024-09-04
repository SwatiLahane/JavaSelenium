package assignment33;
import java.util.Scanner;
//WAP to reverse string using for loop

public class ReverseString 
{
   public static void main(String arg[])
   {
	   Scanner sobj = new Scanner(System.in);
	   System.out.println("Enter String you want to reverse :");
	    String str = sobj.nextLine();
	     
	    char Arr[] = str.toCharArray();
	    String rev = " ";
	    
	    for(int icnt  = 0; icnt < Arr.length; icnt++)
	    {
	    	rev = Arr[icnt] + rev;
	    }
	    		
	     System.out.println("Reversed String "+rev);		
	    
   }
}
