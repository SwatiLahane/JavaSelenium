package assignment5;

public class Constructor1 
{
	//WAP on Constructor 
	
	   Constructor1()  //Constructor
	   {
		   System.out.println("Constructor with no parameter");
		   
	   }
	   Constructor1(int a)  //Constructor
	   {
		   System.out.println("Constructor with one parameter");
		   
	   }
	   Constructor1(int a ,int b,int c)  //Constructor
	   {
		   System.out.println("Constructor with three parameter");
		   
	   }
	   
	   public void main(String arg[])
	   {
		   Constructor1 cobj = new Constructor1();
		   Constructor1 cobj1 = new Constructor1(10);
		   Constructor1 cobj2 = new Constructor1(10,20,30);
		   
	   }
}
