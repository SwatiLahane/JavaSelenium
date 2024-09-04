package assignment35;

import java.util.*;

public class Count_Alph_Space_SpecialChar {
      
	//Count Alphabet,digit ,Space and Special character
	 static int Count_Alpha = 0;
	 static int Count_space = 0;
	 static int Count_Digit = 0;
	 static int Count_SpecialChar =0;
	
	
	public static void main(String[] args) 
	{
	   Scanner sobj = new Scanner(System.in);
	   System.out.println("Enter Alphabet space digit and special character");
		
	   String str = "Swati lahane @12$%*";
	    
	   char ch[] = str.toCharArray();
	   
	   System.out.println("Finding Alphabets :");
	   for(int i = 0; i < str.length(); i++)
	   {
		  boolean b1 =   Character.isAlphabetic(ch[i]);
		  
		  if(b1 == true)
		  {
			  Count_Alpha++;
		  }
		  
	   }
      
	   System.out.println("Alphabet Count Is :"+Count_Alpha);
	   
	   
	   System.out.println("Finding Digit or numeric :");  
	   
	   for(int i =0 ; i < ch.length; i++)
	   {
		  boolean b2 = Character.isDigit(ch[i]);
		  
		  if(b2 == true)
		  {
			  Count_Digit++;
		  }
	   }
	   
	   System.out.println("Digit is : "+Count_Digit);
	   
	   System.out.println("Finding Space :");
	   
	   for(int i = 0; i < ch.length; i++)
	   {
		  //  Character.isSpace(ch[i]);
		    
		   boolean b3 = Character.isSpaceChar(ch[i]);
		    
		   if(b3 == true)
		   {
			   Count_space++;
		   }
		   
	  }
	   
	   System.out.println("Count of Space :"+Count_space++);
	   
	   System.out.println("Finding special Characte ");
	   
	   Count_SpecialChar = ch.length - (Count_Alpha + Count_Digit +Count_space);
	   
	   System.out.println("Count of special character is :"+Count_SpecialChar);
	   
	   
	}

	
	
	
	
	
	
	
	
	
	
	
}
