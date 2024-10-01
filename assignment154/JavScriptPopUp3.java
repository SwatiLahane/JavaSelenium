package assignment154;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavScriptPopUp3 
{
	public static void main(String args[])
	{
		//Assignment 153 Write a program on How to handle Javascript PopUp (using accept and dissmiss)

		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://grotechminds.com/javascript-popup/");
		 
		 driver.findElement(By.xpath("//button[.='Click ']")).click();
		 
		 WebDriverWait w3 = new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		  w3.until(ExpectedConditions.alertIsPresent());
		  
		// boolean urlContains = w3.until(ExpectedConditions.urlContains("javascript-popup"));
		 //System.out.println(urlContains);
		 
	    //	boolean urlMatches =  w3.until(ExpectedConditions.urlMatches("grotechminds"));
        //	System.out.println(b2);
		
		// Boolean isUrlCorrect = w3.until(ExpectedConditions.urlToBe("https://grotechminds.com/javascript-popup/"));
		// System.out.println(isUrlCorrect);
		 
		 
		 
		 driver.switchTo().alert().accept();
		 
		 String s1 = driver.switchTo().alert().getText();
		 System.out.println(s1);
	}
}
