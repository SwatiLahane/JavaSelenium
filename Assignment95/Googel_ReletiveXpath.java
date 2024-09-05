package Assignment95;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googel_ReletiveXpath {

	
	// Launch google, type india, use relative x path
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id ='input']"));
	    
		e1.sendKeys("india"+Keys.ENTER);
	
	}

}
