package assignment120;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Searching_The_Product extends TestCase1
{
       
	  @Test 
	     public void searching_For_Product() throws IOException
	     {
	    	 WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));

	         textbox.sendKeys("Womens T-shirts");
	         
	         
	     }
	
	
}
