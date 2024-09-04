package assignment39;

//input 100 200 300 400 check given number is part of array or not 

import java.util.*;

class Arithematic
{
   public boolean check(int A[],int B)
   {
	   for(int icnt = 0; icnt < A.length; icnt++)
	   {
		   if(A[icnt] == B )
			   
		   {
			   return true;
		   }
	   }
	   return false;
    }

}
public class NumberIsPArtOfArray
{
     
	//Check two Arrays Are equals to each other 
	public static  void main(String arg[])
	{
	  
		Scanner sobj = new Scanner(System.in);
	   int isize = 0;
	   int icnt = 0;
	   boolean b = false;
	   System.out.println("Enter numer of elements u want to enter in an array :");
	   isize = sobj.nextInt();
	   int arr[] = new int[4];
	   
	   System.out.println("Enter Elements :");
	   for(icnt =0; icnt < isize; icnt++)
	   {
		   arr[icnt] = sobj.nextInt();
	   }
	   
	   System.out.println("Enter one Another number u want to check given number is part of Array or not");
	    int ivalue = sobj.nextInt();
	     
	    
		Arithematic aobj = new Arithematic();
		b = aobj.check(arr, ivalue);
		if(b == true)
		{
			System.out.println("Number is part of given Array ");
		}
		else
		{
            System.out.println("Number is not part of given array ");
		}
	}
}

