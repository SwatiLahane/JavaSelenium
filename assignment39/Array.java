package assignment39;

public class Array {
    //In an Array of int data type of size four the values are 100,200,300,400 andcheck 
	//if the given number is a part of array or not
	
	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		 int givennumber  = 100;
		 
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == givennumber)
			{
				System.out.println("Given number is part of array ");
			}
			else
			{
				System.out.println("Given number is not part of Array");
			}
		}

	}

}
