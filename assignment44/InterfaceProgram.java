package assignment44;


 //intereface only have abstrct methods we no need tto add abstract in front of methods 
//by default interface is public 

   interface Circle 
   {
	    float PI = 3.14f;
	    float Area(float Radius);
	    float Circumfarence(float Radius);
	   
   }


  
public class InterfaceProgram  implements Circle {
    
	public float Area(float Radius)
	  {     
		   
		   float Ans = PI * Radius * Radius; 
		   return Ans;
		 
	  }

	 public float Circumfarence(float Radius )
	 {
		 float fAns = 2 * PI * Radius;
		 return fAns; 
	 }
	 
	public static void main(String[] args) 
	{
		
		InterfaceProgram iobj = new InterfaceProgram(); 
		
		System.out.println("Value of PI "+iobj.PI);
		
		float fres = iobj.Area(5.45f);
		System.out.println("Area of circle is "+fres);
		
		float fRes1 = iobj.Circumfarence(5.5f);
		System.out.println("Area of Circumfarence"+fRes1);

	}
	
	 

	

}
