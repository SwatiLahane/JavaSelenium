package assignment3;


public class MethodOverloading
{
	 static void Add()  //Static method
	  {
		  
		  System.out.println("Method oveloading with no argument");
	  }
	  static void Add(int a) //static method
	  {   
		 System.out.println(a);
		  
	  }
	  static int Add(int ino1, int ino2) //static method
	  {   
		 
		  int iAns = ino1 + ino2;
		  return iAns;
		  
	  }
	   int Add(int ino1, int ino2,int ino3) //non static method
	  {
		 int iAns = ino1+ino2+ino3;
		 return iAns;
	  }
	 
	// main method from execution start from here
	  public static void main(String arg[]) 
	  {
		  Add();
		  Add(20);
		 int ires3 = Add(20,30);
		  System.out.println(ires3);
		  MethodOverloading mobj = new MethodOverloading();
		
		  
		  int ires = Add(10,20);
		  System.out.println(ires);
		  int ires1 = mobj.Add(10,20,30);
		  System.out.println(ires1);
		  
		  
	  } 
}
