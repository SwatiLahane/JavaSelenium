package assignment29;

//WAP using this calling

//this keyword is used to call same class constructor

public class ThisCalling
{
    
	ThisCalling()
	{    
		this(12);
		System.out.println("Within Costructor with no parameter");
	}
	ThisCalling(int a)
	{    
		this(12.3,45.3);
		System.out.println("Within Costructor with one parameter");
	}
	ThisCalling(double d,double b)
	{   
		
		System.out.println("Within Costructor with two parameter");
	}
 	
   public static void main(String arg[])
   {
	   ThisCalling tobj = new ThisCalling();
		
   }
}
