package assignment15;

import java.util.*;
//WAP on if condition 2 Genders Male and Female if female travelling is free if Male less than 
//equal to 12 then half ticket and if more than 12 till 59 than full ticket else more than 60 senoir
//cetizen

public class Assignment15 
{ 
	public static void main(String arg[])
  	{    
		//Scanner sobj = new Scanner(System.in);
		
		 char  gender = 'M';
		// char gender1 = 'F';
		 int age = 60 ;
		 
	    if(gender == 'F')
	    {
	    	System.out.println("Travelling is free");
	    } 
	    else if(gender== 'M' && age <= 12)
	    {
	    	System.out.println("Ticket price is half");
	    }
	    else if(gender == 'M'  && age >=59)
	    	
	    {
	    	System.out.println("Ticket price is full");
	    }
	    else if(gender == 'M' && age >= 60)
	    {
	    	System.out.println("Senior Citizen ticket");
	    }
	    else
	    {
	    	System.out.println("Invalid gender");
	    }
	}

}
