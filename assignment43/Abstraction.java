package assignment43;


//Abstract class  
//Ac Can both Abstract methods n concrete methods 
abstract class Demo   //parent class
{   
	
	public int ino;    //class variables 
	public int ino1;   //class variables 
	
	
	abstract void Add();    //abstract methods 
	abstract void Substract();
	abstract void Multiply();
	
	public Demo(int A ,int B)   //constructor gets overriden in child class
	{    
		System.out.println("Inside Constructor of Demo");
		this.ino  = A;
		this.ino1 = B;
	}
	
	
    void Divide()  //non static concrete method
    {   
    	
    	int Ans = ino/ino1;
    	System.out.println("Division is :"+Ans);
    	
    }
    
    static void Login()   //static concrete methods
    {
    	System.out.println("Inside Static concrete method of Abstract class");
    }
    
	
}

public class Abstraction extends Demo   //child class 
{
    public Abstraction(int A, int B) 
    {     
    	super(A,B);  // to super calling statement to call one class constructor from other class constructor
		System.out.println("Inside Constructuctor of Abstraction");
		
	}
    
	void Add()
    {   
    	int iAns = ino + ino1 ;
    	System.out.println("Addition is "+iAns);
    }
	
    void Substract()
    {
    	int iAns = ino - ino1 ;
    	System.out.println("Sum is "+iAns);
    }
    
    void Multiply()
    {
    	int iAns = ino * ino1 ;
    	System.out.println("Multyplication  is "+iAns);
    }
	
	//Main method
 static public void main(String[] args) 
	{
		Abstraction aobj = new Abstraction(40 ,20); //object creation
        aobj.Divide();
        Demo.Login();
        aobj.Add();
        aobj.Substract();
        aobj.Multiply();
        
        
	}

}
