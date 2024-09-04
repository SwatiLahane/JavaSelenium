package assignment18;

import java.util.*;

public class CheckEven 
{
  public static void main(String arg[]) //main method
  {
	  Scanner sobj = new Scanner(System.in); 
	  
	  System.out.println("Enter Number :");
	  int ino = sobj.nextInt();
	  
	  if(ino <= 0)  //Filter
	  {
		  ino = -ino;
	  }
	  
	  if(ino % 2 == 0) //logic to calculate even number 
	  {
		  System.out.println("Number is Even ");
	  }
	  else
	  {
		  System.out.println("Number is Odd ");
	  }
  }
}
