package assignment24;

import java.util.Scanner;

//formula 1/2*(a+b)*h 
public class AreaOfTrapezium {

	public static void main(String[] args)
	{
       
       Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Length of base 1"); 
		int ilength = sobj.nextInt();
		
		System.out.println("Enter Length of base 2 ");
		int ilength1 = sobj.nextInt();
		
		System.out.println("Enter heigth of Trapezium:");
		int iheight = sobj.nextInt();
		
		double iAns = ((0.5) * (ilength + ilength1)/iheight);
		System.out.println("Circumference of Rectangle :"+iAns);
		sobj.close();


	}

}
