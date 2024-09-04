package assignment76;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import assignment75.LinkText;

public class RightclickisdDsable {

	public static void main(String[] args) 
	{
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		
		WebElement e = driver.findElement(By.linkText("Men"));
        
		e.click();
		
	}

}
