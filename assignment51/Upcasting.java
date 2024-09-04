package assignment51;

class Addition
{
	int add()
	{
		int Ans = 10 + 20;
		System.out.println(Ans);
		return Ans;
	}
	int Sub()
	{
		int Ans1 = 20 - 10;
		System.out.println(Ans1);
		
		return Ans1;
	}
}


public class Upcasting extends Addition{
    
	int Max()
	{
		int Ans = 40 + 20;
		System.out.println(Ans);
		return Ans;
	}
	void Min()
	{
		int Ans1 = 30 - 10;
		System.out.println(Ans1);
	}
	
	
	public static void main(String[] args)
	{

		Addition A =new Upcasting();
		
		int iRet = A.add();
		System.out.println("Sum is :"+iRet);
		
		
		int iRet1 = A.Sub();
		System.out.println("Subtractrion is "+iRet);
		
	} 

}
