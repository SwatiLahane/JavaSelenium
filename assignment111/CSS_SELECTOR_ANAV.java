package assignment111;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Goto Amazon serch groceries using AN and AV in css selector locator?

public class CSS_SELECTOR_ANAV {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in");
		 
		 WebElement e1 = driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"));
		 
		 e1.sendKeys("groceries"+Keys.ENTER);
		 

	}

}
