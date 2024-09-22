package assignment130;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class SearchingAndAddtoWishList extends LoginAmazon
{
     
       @Test
   	   public void Product()
   	   {
   		   WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
   	       
   		   e1.sendKeys("shoes"+Keys.ENTER);
   	      
   		   WebElement e2 = driver.findElement(By.xpath("(//span[@class ='rush-component'])[1]"));
	       
		   e2.click();
		   
		  Set<String>  s1 =  driver.getWindowHandles();
		  System.out.println(s1);
		
	      Iterator<String> i1	 = s1.iterator();
	    
	      String ParentId = i1.next();
	      String ChildId =  i1.next();
	      
	      System.out.println(ParentId);//It will Print Parent Id
	      System.out.println(ChildId );//It will Print child Id
   		
	      driver.switchTo().window(ChildId); //move control to a window whos id is childId  
	      
   	      WebElement e3 = driver.findElement(By.id(("//input[@id='add-to-wishlist-button-submit']")));
   	      
   	      e3.click();
   	      
   	   
   	   }
    	  
       
 }
