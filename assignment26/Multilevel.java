package assignment26;



class Singal
{
	static void Fun()
	{
		System.out.println("Inside Super most class ");
	}
	 
}
class Double extends Singal
{
	static void Gun()
	{
		System.out.println("Inside Super Class Gun method");
	}
	void Mun()
	{
		System.out.println("Inside Super Class Mun method");
	}
}

public class Multilevel extends Double 
{
    void Sun()
    {
    	System.out.println("Inside sub class Of sun");
    }
	public static void main(String[] args) 
	{
		
        Fun();
        Gun();
        Multilevel mobj = new Multilevel();
        
        mobj.Mun();
        mobj.Sun();
        
	}

}
