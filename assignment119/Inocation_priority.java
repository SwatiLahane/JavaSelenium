package assignment119;

import org.testng.annotations.Test;


//Default invocation count is 1
//default priority of test case is 0 
//By default test case is enabled only
//WAP to disable a test case
//WAP to do invocation and priority for a testcase together
public class Inocation_priority
{
	@Test(invocationCount=10,priority=1)
    public void testcase1()
    {
    	System.out.println("1");
    }
    @Test(priority = 2)
	public void testcase2()
	{
		System.out.println("2"); 
	}
	@Test(priority = 3)
	public void testcase3()
	{
		System.out.println("3"); //by default priority zero will run then 1
	}
	@Test()
	public void testcase4()
	{
		System.out.println("4");
	}
}
