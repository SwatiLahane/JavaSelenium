package assignment21;
import java.util.*;

//Accept input from user and calculate area of circumfarence 
 //2 * 3.14 * r(radius)
    
public class CircumferenceOfCircle 
 {
       
	   final static double pi = 3.14;
	public static void main(String[] args) 
	{
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter Radius :");
      int radius = sobj.nextInt();
      
      double dAns = 2 * 3.14 * radius; 
      System.out.println("Area of circumfurance is :"+dAns);
      sobj.close();
	}

}
