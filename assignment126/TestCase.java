package assignment126;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase 
{
	
   WebDriver driver;
	
   @Test(retryAnalyzer= assignment126.class)
   public void login_to_amazon()
   {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//Purposefully failing by changing the xpath 
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		//WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("mobiles"+Keys.ENTER);
		
   
   
   }
}
