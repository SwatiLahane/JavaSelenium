package assignment42;

public class FindAverage {

	public static void main(String[] args)
	{
		
        int arr[] =new int[4];
        
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
         int sum = 0;
         double average = 0;
         
        for(int i = 0; i < arr.length; i++)
        {
        	 sum = sum + arr[i];
        }
        
        average = sum / 4;
        System.out.println("Average is "+average);
        
        
        		
	}

}
