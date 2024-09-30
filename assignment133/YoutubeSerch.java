package assignment133;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YoutubeSerch 
{
	//WAP to open the Youtube and then search for a Youtube channel and then click on the Subscribe button and on final page use the Assertion concept?
      
	@Test
	public void YouTubeSerach()
	{
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    WebElement w1 = driver.findElement(By.xpath("//input[@id ='search' ]"));
	    
	    w1.sendKeys("Software Testing By MKT");
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		w1.sendKeys(Keys.ENTER);
		
		
		//
        WebElement w2 = driver.findElement(By.xpath(("//a[@aria-label='Subscribe']")));
	    
	     w2.click();
	     
	     
	 
	  // Assert.assertEquals(driver.getTitle(), "Subscription Added");
	   Assert.assertEquals(driver.getTitle(), "YouTube");
	   
	     
	}
	  

}
