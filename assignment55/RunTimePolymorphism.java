package assignment55;


 //Runtime polymorphism is also called method overriding  

//all the method are nonstatic we only override static methods
//Same method name in child class same return type 


class Demo //parent class /derived class
{
	 void Add(int a, int b)   //nonstatic parameterised method
	 {
		 System.out.println("Doing addition");
	 }
	 void Substraction(int a, int b)  //nonstatic parameterised method
	 {
		  System.out.println("Doing substraction");   
	 }
}


public class RunTimePolymorphism  extends Demo{   
   
	void Add(int a, int b)//nonstatic parameterised method
	 {   
		//a = 10;
		//b = 20;
		 super.Add(a, b);   //keyword to call impl of parent class with child class 
		int c  = a + b;         
		System.out.println(c);
		 
	 }	
	 void Substraction(int a, int b) //nonstatic parameterised method
	 {      
		   super.Substraction(a, b);
		    //a = 10;
			//b = 20;
			
			int c  = a - b; 
			System.out.println(c);
	 }
	
	 //main method from where execution start Jvm call the main method 
	public static void main(String[] args) 
	{
		RunTimePolymorphism aobj = new RunTimePolymorphism(); //object creation
		aobj.Add(10,20);  //reference variable dot method method
		aobj.Substraction(20, 40);
   
	}

}
