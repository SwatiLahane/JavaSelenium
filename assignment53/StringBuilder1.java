package assignment53;

public class StringBuilder1 {

	public static void main(String[] args)
	{
		
		StringBuilder sb = new StringBuilder("Java Coding");
		StringBuilder sb1 = new StringBuilder("Selenium Java");
		
		sb.append(" Logic");
		System.out.println(sb);
	    
		    
	     System.out.println(sb.substring(8));
	     
		 System.out.println(sb1.substring(0, 9));
		
		
		System.out.println(sb.length());
	    System.out.println(sb1.length());
	        
		
		
        sb1.delete(3,6);  //(index start from zero) then 3 to 6-1
        System.out.println(sb1);
        
       
        char ch = sb.charAt(3);
        System.out.println(ch);
        
        sb.reverse();
	    System.out.println(sb);
        
        sb.replace(0,4 , "GIVA");
	    System.out.println(sb);
	    
	    boolean b1  = sb.equals(sb1);
	    System.out.println(b1);
	    
	    
	    //Return type is void 
	   // sb.ensureCapacity(100);
	    
	    
	    int cap = sb.capacity();
	    System.out.println(cap);
       
         //lengthof String one is
        System.out.println(sb.length());
        
        //Length of String 2nd after deleting
        System.out.println(sb1.length());
        
        
       
	}

}
