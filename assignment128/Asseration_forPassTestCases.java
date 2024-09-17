package assignment128;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


//WAP to pass the test case using Assert Class in TestNG?
public class Asseration_forPassTestCases
  {
       @Test
       public void TestCase() throws InterruptedException
       {
    	   
    	   WebDriver driver = new ChromeDriver();

    	   WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
    	   
    	   e1.sendKeys("Mobiles"+Keys.ENTER); 
    	   
    	   Thread.sleep(2000);
    	   
    	   //x Path for All the Mobiles
        	List<WebElement>  w=  driver.findElements(By.xpath("(//div[@class = 'a-section aok-relative s-image-fixed-height'])"));
    	   
    	   System.out.println(e1.getSize());
    	   
    	 // Assert.assertTrue(w.size() < 1);
    	    
    	 
    	    
    	   Assert.assertTrue(true);
    	    
    	   
    	   
       }
	 
	
	
  }
