package assignment118;

import org.testng.annotations.Test;
 
//Default invocation count is 1
//default priority of test case is 0 
//By default test case is enabled only
//WAP to disable a test case
public class Disable_TestCase 
{
   @Test(invocationCount = 10,priority = 1)
   
	   public void testcase1()
	   {
		  System.out.println("1"); 
	   }
     
   @Test(enabled = false)
     public void testcase2()
     {
	   System.out.println("2");
     }
   
   @Test
   public void testcase3()
   {
	   System.out.println("3");
   }
   @Test (priority = 2)
   public void testcase4()
   {
	   System.out.println("4");
   }
   }

