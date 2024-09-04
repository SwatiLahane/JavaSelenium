package assignment23;
import java.util.*;

    //2*(length + width) //some of length and width multiply by 2
public class CircumferenceOfReactangle {
   
	public static void main(String[] args)
	{
	   
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Length of Rectangel");
		int ilength = sobj.nextInt();
		
		System.out.println("Enter Width of rectangle ");
		int iwidth = sobj.nextInt();
		
		int iAns = (2 * (ilength + iwidth));
		System.out.println("Circumference of Rectangle :"+iAns);
		sobj.close();
	}

}
