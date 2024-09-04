package assignment16;
import java.util.*;

public class ArithematicOperation {

	public static void main(String[] args) 
	{
	   Scanner sobj = new Scanner(System.in);
	   
	   System.out.println("Enter Number first  :");
	   
		int ino = sobj.nextInt();
		
		System.out.println("Enter Number second :");
		int ino1 = sobj.nextInt();
		
		int ians = ino + ino1;
		System.out.println("Sum is :"+ians);
	   
	    int ians1 = ino - ino1;
	    System.out.println("Subtraction is :"+ians1);
	    
	    int ians2 = ino * ino1;
	    System.out.println("Multiplication is :"+ians2);
        
	    int ians3 = ino / ino1;
	    System.out.println("division is :"+ians3);
	
	    int ians4 = ino % ino1;
	    System.out.println("Reminder is :"+ians4);
	    
	}

}
