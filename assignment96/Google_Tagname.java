package assignment96;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Tagname {
   //In Google, type india using tagName()
	
	
	public static void main(String[] args) 
	{ 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.tagName("textarea"));
	    
		e1.sendKeys("india"+Keys.ENTER);
     
	}

}
