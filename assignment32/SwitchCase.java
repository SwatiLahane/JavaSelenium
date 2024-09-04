package assignment32;

import java.util.Scanner;

//Write a program on switch case 
//to Display exam time

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		 Scanner sobj = new Scanner(System.in);
		 System.out.println("Primary Scahool portal");
		 System.out.println("Enter the standard : ");
		 int standard = sobj.nextInt();
		 
		 switch(standard)
		 {
			 case 1 :  System.out.println("Your Exam is at 8 am");
			          break ;
			 case 2 :  System.out.println("Your Exam is at 9 am");
	         break ;
	         
			 case 3 :  System.out.println("Your Exam is at 10 am");
	         break ;
	         
			 case 4 :  System.out.println("Your Exam is at 1 pm");
	         break ;
	         
			 case 5 :  System.out.println("Your Exam is at 2 pm");
	         break ;
		    
			 default :
			 System.out.println("Invalid Option");
			 
		 }
		 
		 
	}

}
