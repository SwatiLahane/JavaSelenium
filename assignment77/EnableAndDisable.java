package assignment77;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableAndDisable {
  
	// Launch Amazon.com search for shoe only if the search text fiels isenabled and isDisplayed
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
	     
		if(e.isDisplayed() && e.isEnabled())
		{
			e.sendKeys("Shoe"+Keys.ENTER);
		}
	
	}

}
