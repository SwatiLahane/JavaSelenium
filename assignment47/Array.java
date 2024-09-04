 package assignment47;

 import java.util.*;
//import java.util.Arrays;

public class Array {
     
	
	//WAP take a array of size 4 and 5
	public static void main(String[] args) 
	{
		//datatype variable[] = new datatype[size]
		 //Scanner sobj = new Scanner(System.in);
		//System.out.println("Enter The Array u want to store :");
		//int isize = sobj.nextInt();
		
		int  Arr[] = new int[ 4];
		
		Arr[0] = 10; 
		Arr[1] = 20; 
		Arr[2] = 30; 
		Arr[3] = 40; 
		
		
		
		System.out.println(Arrays.toString(Arr));
		try
 		{   
			Arr[4] = 60;  
			
		 }
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception Handled");
		}
		
		try
		{
			for(int i = 0; i <= 5; i++)
			{
				System.out.println(Arr[i]+" ");
				
			}
		
		}
		  catch(ArrayIndexOutOfBoundsException a)
		  {
			  System.out.println("Exception Handled");
		  }
		
		
		System.out.println(Arrays.toString(Arr));
	}

}
