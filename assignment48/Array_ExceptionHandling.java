package assignment48;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_ExceptionHandling
{
          
	
	public static void main(String[] args)   
	{
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("Enter Size of Array :");
		 int isize  = sobj.nextInt();
		 
		 int Arr[]  = new  int[isize];
		 
		 System.out.println("Enter Number Element u want to store in an array");
		 
		 try
		 {
			 for(int i =0; i <= isize; i++)
			 {
				 Arr[i] = sobj.nextInt();
			 } 
		 }
		 
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Exception Handled ");
		 }
		 
		 catch(InputMismatchException e)
		 {
			 System.out.println("Exception Handled ");
		 }
  
		 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
