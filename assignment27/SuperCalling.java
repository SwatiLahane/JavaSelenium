package assignment27;

//WAP on super calling statement


class Super  //most parent class
{
	Super(int  a ,int b)
	{  
	   super();
	   System.out.println("Inside super  constructor ");
	}
	
}
class Super1 extends Super    //parent class
{
	Super1()  
	{   
		super(10, 20); //to call parent  class Constructor
		System.out.println("Inside super1  constructor ");
	}
}


//we use the concept of super calling in inheritance
public class SuperCalling extends Super1  //child class 
{
     
	
	SuperCalling(double b)
	{   
		super(); //is used o call parent class constructor
		System.out.println("Inside Super Calling Constructor with double parametr");
	}
	SuperCalling(int a)
	{    
		System.out.println("UInside Super calling Constructor with int parameter");
	}
	
	public static void main(String[] args) 
	{
		SuperCalling sobj = new SuperCalling(54);
		
	}

}
