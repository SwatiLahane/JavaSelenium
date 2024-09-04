package assignment37;

public class Array_Program {
         //check number is present or not two array are equal or not  
	public static void main(String[] args) 
	{
		 int arr[] = new int[5];
		 arr[0]  = 10;
		 arr[1]  = 20;
		 arr[2]  = 30;
		 arr[3]  = 40;
		 arr[4]  = 50;
		 
		 int number = 10;
		 
		 for(int i = 0; i < arr.length; i++)
		 {
			 if(number == arr[i])
			 {
				 System.out.println("Number is present at index = 1");
			 }
			 else
			 {
				 System.out.println("Number is upsent ");
			 }
		 }
		 
	}

}
