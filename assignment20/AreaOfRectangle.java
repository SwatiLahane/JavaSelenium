package assignment20;

import java.util.Scanner;

public class AreaOfRectangle {

	//Accept Number from user and calculate area of Rectangle
	//area of a rectangle = length × width .
	public static void main(String[] args) 
	{
	   Scanner sobj = new Scanner(System.in);
	   
	   System.out.println("Enter Length of  Reactangle ");
	   int ilength = sobj.nextInt();
	   
	   System.out.println("Enter Length of  Reactangle ");
	   int iwidth = sobj.nextInt();
	   
	   int iAns = ilength * iwidth;
	   
	   System.out.println("Area of reactangle is :"+iAns);
	   
	   sobj.close();
	  
	}

}
