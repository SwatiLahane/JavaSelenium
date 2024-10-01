package assignment154;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptPopUp
{   
	
	public static void main(String args[])
	{
		//Assignment 153 Write a program on How to handle Javascript PopUp (using accept and dissmiss)

		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://grotechminds.com/javascript-popup/");
		 
		 driver.findElement(By.xpath("//button[@class='btnjs']"));
		 
		  WebDriverWait w1 = new  WebDriverWait(driver,Duration.ofSeconds(10));
		// w1.until(ExpectedConditions.titleIs("Google"));
		  
		  WebDriverWait w2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		  w2.until(ExpectedConditions.titleIs("JavaScript Popup - GroTechMinds"));
		 driver.switchTo().alert().accept();
		 
		 String s =  driver.switchTo().alert().getText();
		 System.out.println(s);
		 
		
	}
	
}
