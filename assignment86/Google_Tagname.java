package assignment86;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;


public class Google_Tagname
{   
//	WAP to launch google.com and search India using tagname

	public static void main(String[] args) 
	{
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("textarea")).sendKeys("India"+Keys.ENTER);
		
		
		
	}
	
   }

