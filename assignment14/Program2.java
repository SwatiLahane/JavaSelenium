package assignment14;
import java.util.*;

//
class Arithematic 
{
    public int ino;
    
    public Arithematic(int A)
    {
    	this.ino = A;
    	
    }
    public boolean Voter()
    {
       if(ino >= 18)
       {
    	   return true;
       }
       else
       {
    	   return false;
       }
    }
}

public class Program2 
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the Age :");
       int Age = sobj.nextInt();
       
       Arithematic aobj = new Arithematic(Age);
       
       boolean bres = aobj.Voter();
       if(bres == true)
       {
    	   System.out.println("You can vote");
       }
       else
       {
    	   System.out.println("You can not vote");
       }
       
    }
}
