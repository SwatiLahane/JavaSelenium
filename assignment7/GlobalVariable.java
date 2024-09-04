package assignment7;

public class GlobalVariable 
{
	//global variable can be static or non static
	 static int a = 30; //globle variable
	 int b1 = 20; //nonstatic global variable
	 int age = 33;//default value is 0
	static void Add()
	{
		int b =100; //local variable
		int c = + b;
		System.out.println(c);
		
	}
	int Sub()  //nonstatic method
	{
		int ino = 10;
		int ians = ino - a;
		return ians;
		
	}
	public static void main(String arg[])
	{   
		
		Add();
		GlobalVariable gobj =new GlobalVariable ();
		System.out.println("age is"+ " " +gobj.age);
		int ires = gobj.Sub();
		System.out.println(ires);
	}

}
