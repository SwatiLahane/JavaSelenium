package assignment35;
import java.util.*;

public class CountSpace {

	public static void main(String[] args)
	{    
		Scanner sobj = new Scanner(System.in);
		String str = null;
		int icount = 0;
		System.out.println("Enter String :");
		str = sobj.nextLine();
		
          char Arr[] = str.toCharArray();
          
          for(int i = 0 ; i < Arr.length; i++)
          {
        	  if(Arr[i] == ' ' )
        	  {
        		  icount++;
        	  }
        	  
        	  
          }
          
          System.out.println("Frequency of space is "+icount);
	}

}
