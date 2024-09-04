package assignment54;



public class CompileTimePolymorphism
{
       
	
	//WAP to showcase the Compile Time Polymorphism
		//compile time polymorphism is called as method overloading
	
	
	 static void Add() //static method
	  {
		  
		  System.out.println("1");
	  }
	   void Add(int a)  //nonstatic method
	  {   
		  System.out.println("2");
		  System.out.println(a);
		  
	  }
	  static void Add(String a)  //static method
	  {   
		  System.out.println("3");
		  System.out.println(a);
		  
	  }
	   static void Add(String a, char b,double c) //static method
	  {
		 System.out.println("4");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
		 
		 
	  }
	   static  void Add(boolean a)
	   {
		  System.out.println(a); 
	   }


	  public static void main(String arg[])
	  {
		  
		  
		  CompileTimePolymorphism mobj = new CompileTimePolymorphism();
		  mobj.Add(20);
		  Add(true);
		  Add();
		  Add("Swati");
		  Add("Swati",'S',10.23);
		  
	  }	  
		  
	  }