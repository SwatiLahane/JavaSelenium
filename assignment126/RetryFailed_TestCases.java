package assignment126;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



//WAP to retry the failed testcases using IRetryAnalyzer interface
public class RetryFailed_TestCases implements IRetryAnalyzer
{
    
	//If we write true means it will retrieve for infinite times
	
	int Current_count = 0;
	int noofRetry = 3; //number of retry set the number how many times u want to retrieve
	@Override
	public boolean retry(ITestResult result)
	{
		if(Current_count  < noofRetry)
		{
			Current_count++;
			return true; //give retry
		}
		return false; //dont retry 
	}
     
	
}
