package assignment127;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//WAP to fail the test case deliberately using Assert Class in TestNG?
public class AssertInTestng 
{
     
	  @Test
	  public void TestCase() throws InterruptedException
	  {
		    
		    ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("Women Watches"+Keys.ENTER);
			
			Thread.sleep(2000);
			
			//xpatth for all the watches
		    List<WebElement> e2 = driver.findElements(By.xpath("(//a[@class = 'a-link-normal s-no-outline'])"));
		    
		    System.out.println(e1.getSize());
		    
		    //Assert.assertTrue(e2.size() > 1);
		    
		    //expected is false but actual is true 
		    Assert.assertFalse(true);
		  
	  }
	
	
}
