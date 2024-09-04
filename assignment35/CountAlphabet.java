package assignment35;

import java.util.Scanner;
 
//Count Small and capital alphabet 
public class CountAlphabet {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		String str = null;
		
		System.out.println("Enter the String :");
		str = sobj.nextLine();
		 int icount = 0;
		 char Arr[] = str.toCharArray();
		
		for(int i = 0; i < Arr.length; i++)
		{
			if(((Arr[i] >= 'A') && (Arr[i] <= 'Z')) || ((Arr[i] >= 'a') && Arr[i] <='z' ));
			{
	           icount++;   
			}
		}
         System.out.println("count alphabet "+icount);
	}

}
