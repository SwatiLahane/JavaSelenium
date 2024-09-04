package assignment14;
import java.util.*;

public class Program1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the age :");
		int Age = sobj.nextInt();
		
		if(Age >= 18)
			
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("you can not vote ");
		}
		
		
	}
  
}  
