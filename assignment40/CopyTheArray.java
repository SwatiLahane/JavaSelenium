package assignment40;

import java.util.Arrays;

public class CopyTheArray {

	 //WAP to copy the array into another array
	public static void main(String[] args)
	{  
	     int arr[] = new int[4];
	     
	     arr[0] = 10;
	     arr[1] = 20;
	     arr[2] = 30;
	     arr[3] = 40;
	     
	     int arr1[] = new int[4];
	     
	     for(int i =0; i < arr.length; i++)
	     {
	    	 arr1[i] = arr[i]; 
	     }
	     
	     System.out.println("old Array ");
	     System.out.println(Arrays.toString(arr));
	     
	     System.out.println("After coping ");
	     System.out.println(Arrays.toString(arr1));
	     
            
	}

}
