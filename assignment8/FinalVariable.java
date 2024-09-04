package assignment8;

//WAP on final variable

public class FinalVariable 
{
	void Radius()
	{
		final double pi =3.14;
		//pi = 5; we can not change value of final variable 
		int r = 5;
		double ians = pi*r*r;
		
		System.out.println(ians);
		
	}
	
    public static void main(String arg[])
    {
    	FinalVariable fobj = new FinalVariable();
    	fobj.Radius();
    	
    }
}
