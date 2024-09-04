package assignment45;

import java.util.Arrays;

public class CheckAnagram

{
      
	//Comare length of string 
	//Convert it into toCharArray like [a,c,t]
	
	public static void main(String[] args) 
	{
		   String name = "act";
		   String name1 = "cat";
		 
		 if(name.length() != name1.length())
		  {
		     System.out.println("Its not ANAGRAM");	 
	      }
		 else
		 {
			 char c1[] = name.toCharArray();
			 char c2[] = name1.toCharArray();
			 
			 Arrays.sort(c1);
			 Arrays.sort(c2);
			 System.out.println(Arrays.toString(c1));
			 System.out.println(Arrays.toString(c2));
		 }
	
	}
}

	