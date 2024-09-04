package assignment41;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int OldArr[] = new int[3];
		
		OldArr[0] = 12;
		OldArr[1] = 23;
		OldArr[2] = 33;
		
		
		int ReverseArray[] = new int[3];
		
	/*	ReverseArray[2] = OldArr[0]; 
		ReverseArray[1] = OldArr[1];
		ReverseArray[0] = OldArr[2];   */
		
		for(int i = 0 , k = 2; i< OldArr.length; i++,k--)
		{
			ReverseArray[k] = OldArr[i];
		}
        
		System.out.println("old Arrys");
		System.out.println(Arrays.toString(OldArr));
		
		System.out.println("Reverse Arrays");
		System.out.println(Arrays.toString(ReverseArray));
		
	}

}
