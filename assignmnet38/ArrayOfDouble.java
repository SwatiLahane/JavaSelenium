package assignmnet38;

import java.util.Scanner;

public class ArrayOfDouble {

	   //Create an array of double data type and take input from scanner class 
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter The size  :");
		double size = sobj.nextDouble();
		
		double arr[] = new double[(int) size];
        
		System.out.println("Enter Element that u want to store in an array :");

        for(double i = 0.0; i < arr.length; i++)
        {
            arr[(int) i] = sobj.nextDouble();
        }
        
		System.out.println("Your Enter Array is");
		{
			for(double i = 0.0; i < arr.length; i++)
	        {
	            System.out.println(arr[(int) i]);
	        }
		}
	}

}
