package assignment143;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTestCases
{
	//WAP to skip the test case using TestNg?
	 
	@Test
	public void login()
	{
		Assert.assertEquals(0,10); //here login is failed 
		//if the expected beheviour not matching with actual then test case automatically get failed
		//so we we here assertion concept 
	}
	@Test(dependsOnMethods = "login")
	public void logout() //n logout is skiped because it depends on login
	{
		
	}
	

}
