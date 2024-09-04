
package assignment57;


class Amazon 
{
	private int otp = 0000;
	
	public int getOtp() 
	{
		return otp;
	}
	public int setOtp(int i)
	{    
		this.otp = i;
		return otp; 
	}
}

public class Encapsulation_Int { 
	
			//WAP to showcase the Encapsulation using Int data type
			public static void main(String[] args)
			{ 
				Amazon obj = new Amazon();
				obj.setOtp(123);
				System.out.println(obj.getOtp());
			          
				
			}

		
	

	}


