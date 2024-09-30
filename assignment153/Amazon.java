package assignment153;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon
{
	//Assignment 152 Wap On Login to  Amazon.com And use Explicit  wait and Use its Multiple methods 

	public static void main(String[] args)
	{
		   
		
		    ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			WebElement un = driver.findElement(By.id("ap_email"));
			
			un.sendKeys("lahaneswati24@gmail.com");
			
			WebElement btn = driver.findElement(By.id("continue"));
			btn.click();
			
			WebElement password = driver.findElement(By.id("ap_password"));
	        password.sendKeys("swati_@lahane"); 
	       
	        //Explicit wait 
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.titleContains("Amazon Sign"));
	        WebElement signinButtn = driver.findElement(By.id("signInSubmit"));
	       
	        signinButtn.click();
	       

	}

}
