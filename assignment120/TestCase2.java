package assignment120;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase2 
{
	//TestCase 2
 	//login to amazon -> searching product-> clicking on 1st product->take screenshot ->logout

	WebDriver driver;
    @BeforeMethod
   public void LaunchAndQuit() throws IOException
   {
    	 WebDriver driver = new ChromeDriver();
   	     driver.get("https://www.amazon.in/");
   	  
   	   //See where is Account n listas take class name from there
   	    WebElement w1 = driver.findElement(By.xpath("(//span[@class = 'nav-line-2'])[1]"));
         
         //to overover on Hello Sign in
    	  
         Actions a1 = new Actions(driver);
         
          a1.moveToElement(w1).perform();
         
        		  
          WebElement w2 = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
          w2.click();
         
          WebElement un = driver.findElement(By.id("ap_email"));
     	
 	      un.sendKeys("lahaneswati24@gmail.com");
 	   
 	      WebElement btn = driver.findElement(By.id("continue"));
 	      btn.click();
 	  
 	     WebElement password = driver.findElement(By.id("ap_password"));
         password.sendKeys("swati_@lahane");  
      
         WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
     
         signinButtn.click();
         
        
   
   
   }
   
  
    
    
    @AfterMethod
   	 public void logout_To_Amazon() throws InterruptedException, IOException
     {
    	    	//Logout to amazon
    	    	
    	    TakesScreenshot t1 =   (TakesScreenshot) driver;
         
            File Source = t1.getScreenshotAs(OutputType.FILE);
         
            File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\WomensTshirts.png"+Math.random()+".png");
         
           FileHandler.copy(Source, Destination);
         
            Thread.sleep(2000);   
    	          
    	    	//See where is Account n listas take class name from there
    	  	     WebElement w1 = driver.findElement(By.xpath("(//span[@class ='nav-line-2'])[1]"));
    	  	     
    	  	     Actions s2 = new Actions(driver); 
    	  	     s2.moveToElement(w1).perform();
    	  	     
    	  	     WebElement w2 = driver.findElement(By.xpath("//span[.='Sign Out']"));
    	         w2.click();
    	  	  
    	    	 
    	        
    	  	     
    	    	Thread.sleep(2000);
    	    	driver.quit();
    	    	
    	    	
    }






















}
