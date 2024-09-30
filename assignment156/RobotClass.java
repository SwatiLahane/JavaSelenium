package assignment156;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass
  { 
	
	public static void main(String args[]) throws AWTException
	{
	//lauch google https://www.google.com/ and do the rightclick on 'gmail' and select a third option with says open the link in incognito mode

    
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.google.com/");     
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement e1 = driver.findElement(By.linkText("Gmail"));
       
       
       Actions a1 = new Actions(driver);
       a1.doubleClick(e1).perform();
        
       
       Robot r1 =  new Robot(); //to select options 
       r1.keyPress(KeyEvent.VK_DOWN); //vk is virtual key all the vk is present under Key event class 
       
	   r1.keyPress(KeyEvent.VK_DOWN); //key press is nonstatic method 
	    
	   r1.keyPress(KeyEvent.VK_DOWN);
	
	}
 }	
	
