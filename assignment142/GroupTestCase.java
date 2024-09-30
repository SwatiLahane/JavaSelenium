package assignment142;

import org.testng.annotations.Test;

public class GroupTestCase 
{      
//	WAP to group the test cases and generate .xml file basis smoke , regression and system testing using grouping concept in testng?
//Make xml for separete testcases 
//if i include system testing n exlude regression it also exclude system with regression 
	//then System testing run only one time
     
	@Test(groups = {"System"})
	
		public void TestCase1()
		{
		
	    }

    @Test(groups = {"Smoke","Regression"})
        public void TestCase2()
        {
    	  
        }
    @Test(groups = {"System","Regression"})
        public void TestCase3()
        {
    	
        }
    @Test(groups = {"Smoke","System","Regression"})   
        public void TestCase4()
        {
    	
        }
}
