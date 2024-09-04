package assignment33;
import java.util.*;
public class StringRevese1 
{
	public static void main(String args[])
	{  
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Original String :");
		
		String str = sobj.nextLine();
		
		String  rev =  " ";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			char c  = str.charAt(i);
			rev = rev + c;
		}
		System.out.println("Reverse string is :"+rev);
		
		
		
	}
}
	
