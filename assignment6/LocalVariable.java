package assignment6;

//WAP on how to use Local Variable in program

public class LocalVariable 
{  
   static void Sub()
   {
	   int a  = 20; //local variable
	   int b  = 10; //local variable
       int ians = a-b;
       System.out.println(ians);
   }
   static void Add()
   {
	   int a = 10; //local variable
	   int b = 20;
	   int iret = a+b;
	   System.out.println(iret);
   }
   void Multiply()
   {
	   int a = 5;  //local variable
	   int b = 10; //local variable
	   int iret = a * b;
	   System.out.println(iret);
   }
	
   public static void main(String arg[])
   {    
	    Sub();
	    Add();
	    
	    LocalVariable lobj = new LocalVariable();
	    lobj.Multiply();
   }
}
