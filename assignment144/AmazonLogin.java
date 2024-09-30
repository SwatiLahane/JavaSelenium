package assignment144;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin 
{
    //WAP to login to Amazon and with the help of timeOut TestNg concept generate ThreadTimeOutException?
    //We use timeout parameter @Test 
	//it decide that perticular test case  should be completed in how much time
    //If the Test case is not run withen given time then it will give an exception n stop execution itself

	
     @Test(timeOut = 6000) // if login is not happen within 6 sec then it will give exeception 
     //ThreadTimeoutException
     
     public void login()
     {
    	  ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			WebElement un = driver.findElement(By.id("ap_email"));
			
			un.sendKeys("lahaneswati24@gmail.com");
			
			WebElement btn = driver.findElement(By.id("continue"));
			btn.click();
			
			WebElement password = driver.findElement(By.id("ap_password"));
		    password.sendKeys("swatlahane"); 
		   
		    WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
		   
		   signinButtn.click();
	
     }



}
