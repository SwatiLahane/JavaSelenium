package assignment120;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Searching_For_Product1 extends TestCase2 
{
	  
    @Test
    public void Searching_for_product() throws IOException, InterruptedException
    {
    	
    	
    	
    	WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));

         textbox.sendKeys("Womens T-shirts");
         
         WebElement product = driver.findElement(By.id(" (//a[@Class ='a-link-normal s-no-outline'])[1]"));

         product.click();
         
         
         Set <String> s1 = driver.getWindowHandles();
        // System.out.println(s1);
         
        driver.close();
        Iterator <String> i1 = s1.iterator();
        
        String ParentId  = i1.next();
        String ChildID = i1.next();
        
         System.out.println(ParentId);
         System.out.println(ChildID);
         
         driver.switchTo().window(ChildID);
         
        
        
    }
    
}
