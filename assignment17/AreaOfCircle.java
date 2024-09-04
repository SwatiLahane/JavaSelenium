package assignment17;
import java.util.*;

public class AreaOfCircle 
{
   public static void main(String arg[])
   {
	   Scanner sobj = new Scanner(System.in);
       System.out.println("Enter radius :");
       int Radius = sobj.nextInt();
       double PI = 3.14;
       
       double fResult =  ((PI )* (Radius * Radius));
       
       System.out.println("Area of circle is :"+fResult);
       
   }
}
