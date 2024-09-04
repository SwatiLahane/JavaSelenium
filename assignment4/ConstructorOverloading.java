package assignment4;



public class ConstructorOverloading
{
	ConstructorOverloading(int a) 
	  {
		  System.out.println("Inside Constructor");
	  }
	  ConstructorOverloading(int a,int b)
	  {
		  System.out.println("Inside parameterised Constructor");
	  }
	  ConstructorOverloading(int a,int b,int c) //
	  {
		  System.out.println("Inside parameterised Constructor");
	  }
	  
	  int Add(int ino , int ino1)//nonstatic methods
	  {
		 int ians =  ino + ino1;
		 return ians;
	  }
	  
	  static void Add(int A ,int B ,int C) //non static method
	  {
		  int ians = A+B+C;
		  System.out.println(ians);
	  }
	  
	  //Main method from execution strats
	  public static void main(String arg[])
	  {
		  ConstructorOverloading cobj = new ConstructorOverloading(10);
		  ConstructorOverloading cobj1 = new ConstructorOverloading(10,10);
		  ConstructorOverloading cobj2 = new ConstructorOverloading(10,20,30);
		  int ires = cobj1.Add(10,20);
		  System.out.println(ires);
		  Add(10, 20, 30);
		 
		  
	  }
}
