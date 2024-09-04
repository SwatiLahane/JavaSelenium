package assignment1;

public class Staticmethod 
{
	public static void Addition() //method
	{
		System.out.println("This is Addition method");
	}
	public static void Substraction()//method
	{
		System.out.println("This is Substraction method");
	}
	static void Multiplication()//method
	{
		System.out.println("This is Multiplication method");
	}
	
	
	//Main method jvm will call main method 
	//execution start from here
	public static void main(String arg[])
	
    {
		
	  System.out.println("This is main method"); 
	  
	  Addition(); //static method can call directly
	  Substraction();
	  Multiplication();
	  
	  
    }
	
}

