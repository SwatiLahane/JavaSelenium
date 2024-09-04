package assignment28;

//Wap on super kyeword(method overriding)
//super keyword is used to call pafrent call method in method overriding

class SuperKeyword1
{
	void LoginFunctionality()
	{
	    System.out.println("Enter Login details"); 	
	}
}

public class SuperKeyword extends SuperKeyword1
{    
	void LoginFunctionality()
    {
		super.LoginFunctionality(); //sysntax to call parent method 
    	System.out.println("Click on forget password link");
    }
	public static void main(String arg[])
	{
		SuperKeyword sobj = new SuperKeyword();
		sobj.LoginFunctionality();
	}
    
}
