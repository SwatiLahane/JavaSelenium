package assignment109;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
    
	//Goto Amazon and search for shoe using ID in CSS Selector?
	
	public static void main(String[] args)
	{
	      WebDriver driver = new ChromeDriver();
	     
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	     
	      WebElement e1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	      e1.sendKeys("Travell Bags"+Keys.ENTER);
	      
	}

}
