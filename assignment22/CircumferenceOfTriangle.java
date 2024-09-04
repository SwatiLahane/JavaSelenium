package assignment22;

import java.util.Scanner;

// a+ b+c
public class CircumferenceOfTriangle 
    {

	  public static void main(String[] args) 
	   {
	      Scanner sobj = new Scanner(System.in);
	      System.out.println("Enter left Side of triangle:");
	      int a = sobj.nextInt();
	      
	      System.out.println("Enter right Side of triangle:");
	      int b = sobj.nextInt();
	      
	      System.out.println("Enter base of triangle:");
	      int c = sobj.nextInt();
	      
	      int iAns = a + b + c;
	      System.out.println("circumfurance of triangle :"+iAns);
	      sobj.close();	
		   
					
    
	   }

}
