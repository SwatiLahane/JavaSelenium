package assignment123;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//WAP to take int datatype data for data driven testing using @DataProvider annotation

 public class DataDriven_Testing
  {
      @Test(dataProvider = "data")
      public void method(int input)
      {
    	  System.out.println(input);
      }
      
      @DataProvider(name = "data")
      public Object[][] datainput()
      {
    	  
    	  Object[][] d= {{20},{34},{44},{5},{13}};
    	  
    			  return d;
      }
  }
