package assignment154;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopUp
{   
	
	public static void main(String args[])
	{
		//Assignment 153 Write a program on How to handle Javascript PopUp (using accept and dissmiss)

		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://grotechminds.com/alert/");
		 
		 driver.findElement(By.linkText("Received1"));
		 driver.switchTo().alert().dismiss();
		 
		 String s =  driver.switchTo().alert().getText();
		 System.out.println(s);
		 
		
	}
	
}
