package assignment31;

//Addition program usung this keyword
import java.util.Scanner;

class Arithematic
{
	public int ino;
	public int ino1;

    Arithematic(int A ,int B)
    {
    	  this.ino  =  A;
    	  this.ino1 =  B;
    	  
    }
    
    public int Addition()
    {
		int iAns = ino + ino1;
		
    	return iAns;
     }

}


public class ThisKeyword 
{
        public static void main(String args[])
        {
           Scanner sobj = new Scanner(System.in);
           System.out.println("Enter First number :");
           int ivalue = sobj.nextInt();
           System.out.println("Enter Second number :");
           int ivalue2 = sobj.nextInt();
           
           Arithematic aobj =new Arithematic(ivalue, ivalue);
           
            int ires = aobj.Addition();
            System.out.println("Sum is :"+ires);
           
        }
}
