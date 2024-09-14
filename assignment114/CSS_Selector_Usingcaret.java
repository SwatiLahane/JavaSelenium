package assignment114;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Usingcaret {
  
	//Goto Amazon and locate search field with the help of caret symbol in Css selector and then enter saree.
	public static void main(String[] args) 
	{
	     
		WebDriver driver = new ChromeDriver();
		 
		   driver.get("https://www.Amazon.com");
		 
		   WebElement e1 = driver.findElement(By.cssSelector("[id^='twotab']"));
		 
		   e1.sendKeys("Saree"+Keys.ENTER);

	}

}
