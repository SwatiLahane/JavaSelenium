package assignment25;



class Arithematic 
{    
	 public int A;
	 public int B;
	
	static void  Fun()
	{
		
	    System.out.println("Inside Fun of Super class ");
	   
	}
	Arithematic()
	{
		System.out.println("Inside Constructor");
		this.A = 10;
		this.B = 20;
	}
	 void gun()
	{
		System.out.println("Inside gun of Super class ");
	}
	
}
	

public class SingleLevelInheritance  extends Arithematic
{   
	
	static void mun()
	{
		
		System.out.println("Inside Mun of Sub class");
	}
	 SingleLevelInheritance() 
	 {   
		 System.out.println("Sub class Constructor ");
	 }
	public static void main(String args[])
	{      
		   Fun();
		   SingleLevelInheritance sobj = new SingleLevelInheritance();
		   sobj.gun();
		   mun();
		   System.out.println(sobj.A);
		   System.out.println(sobj.B);
	}
}
