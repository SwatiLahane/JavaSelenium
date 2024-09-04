package assignment58;

import java.util.Date;

public class Current_Date_Time {

	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String time = d2.toString();
        
		String month = time.substring(4,7);
		System.out.println(month);
		
		String Date = time.substring(8,11);
		System.out.println(Date);
		
		String year = time.substring(time.length()-4);
		System.out.println(year);
		
		
	}

}
