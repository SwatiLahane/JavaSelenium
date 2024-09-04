package assignment78;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {
     
	
	//Launch Google.com type india do it with new x path method
	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); //to maximize the browser
		
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		search.sendKeys("India"+Keys.ENTER);
		
		
		//WebElement search1 = driver.findElement(By.xpath("//textarea[1]"));
		
//		search.sendKeys("India"+Keys.ENTER);
		
		
	
	}

}
