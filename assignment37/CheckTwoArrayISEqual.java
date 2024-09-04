package assignment37;

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
public class CheckTwoArrayISEqual
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
	   int arr[] = new int[isize];
	   
	   System.out.println("Enter Elements :");
	   for(icnt =0; icnt < isize; icnt++)
	   {
		   arr[icnt] = sobj.nextInt();
	   }
	   
	   System.out.println("Enter one Another number u want to check equal or not");
	    int ivalue = sobj.nextInt();
	     
	    
		Arithematic aobj = new Arithematic();
		b = aobj.check(arr, ivalue);
		if(b == true)
		{
			System.out.println("Number is Present ");
		}
		else
		{
            System.out.println("Number is Absent ");
		}
	}
}

