package assignment132;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows_based_PopUp

{
	// WAP to open Naukri.com registration page and the click on Google and close first the parent window , check assertion and at last close the child window using window handles concept?
	//Popup based window 
	    
      @Test
      public void Popup()
      {
    	 
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
    	  driver.manage().window().maximize();
    	  
    	  WebElement e1 = driver.findElement(By.xpath("(//span[ . = 'Google'])[1]"));
    	  e1.click(); ////after click on google child window popup will come
    	  
    	  Set<String> s1 = driver.getWindowHandles();
    	  System.out.println(s1);
    	  
    	  driver.close(); //parent window gets closed which has control
    	  
    	  Iterator<String> i1 = s1.iterator();
    	  
    	  String ParentId =  i1.next();
    	  String ChildId = i1.next();
    	  
    	  System.out.println(ParentId);
    	  System.out.println(ChildId);
    	  
    	  driver.switchTo().window(ChildId);
    	   
    	  
   	      driver.close();//After moving control parent to child now child window getclose

    	  
    	 
    	   
     }
	
	
}
