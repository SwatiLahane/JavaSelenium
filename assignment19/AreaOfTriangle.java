package assignment19;
import java.util.*;

//WAP to calculate are of Triangle  A = 1/2 × b × h.(base ,height )


public class AreaOfTriangle 
{
	public static void main(String args[])
	{
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("Enter Base of triangle  :");
		 int base  = sobj.nextInt();
		 
		 System.out.println("Ennter Height of triangle ");
		 int height = sobj.nextInt();
		 
		 double fAns =  (0.5 *  base * height);  
		 System.out.println("Area of triangle is :"+fAns);
		 
		 sobj.close();
		 
	}
 
}
