package assignment36;



import java.util.Arrays;

//how many are alphabets present 
//how many are spaces present 
//how mnay are special characters preseentt
public class Special_Character 
{     
	static int count_of_alphabet = 0;
	static int count_of_numeric = 0;
	static int count_of_space = 0;
	static int count_of_special_character = 0;
	
	
	public static void main(String arg[])
	{
		//String input = "kv no 1 Banaglore&%";
		String input = "Swati 123@-#";
		char []c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		//count Alphabet 
		System.out.println("Finding Alphabets ");
		for(int i = 0; i < input.length(); i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			
			//System.out.println(answer);
			if(answer == true)
			{
				count_of_alphabet++;
			}
			
		}
		
		System.out.println("The total alphabets are ->"+count_of_alphabet);
		
		//Numeric
		
		 System.out.println("Finding numeric :");
		for(int i = 0; i < input.length(); i++)
		{
			boolean answer1 = Character.isDigit(c1[i]);
			//System.out.println(answer1);
			if(answer1 == true)
			{
				count_of_numeric++;
			}
		}
	     System.out.println("the Total Numeric count is ->"+count_of_numeric);
		
	     //Space 
	     System.out.println("Finding Space :");
		for(int i = 0; i < input.length(); i++)
		{
			boolean answer2 = Character.isSpaceChar(c1[i]);
			//System.out.println(answer2);
		if(answer2 == true)
			{ 
				count_of_space++;
			}
			
	    }
		System.out.println("the Total Space count is ->"+count_of_space);
		
		
		System.out.println("Finding Spacial character :"); 
		
		count_of_special_character = input.length()-(count_of_alphabet + count_of_numeric + count_of_space);
	    System.out.println("Special Character is "+ count_of_special_character);
	    
	    
	}		
}
