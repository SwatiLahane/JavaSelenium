package assignment104;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UniqueScreenShot {
       
	// WAP to take a unique screenshot using className.
	public static void main(String[] args) throws IOException
	{
		
		ChromeDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		
		driver.get("https://www.Amazon.in/");
		 
	    WebElement e1 = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])"));
	    
	    e1.sendKeys("women watches"+Keys.ENTER);
	    
	                 //  TakesScreenshot t1 = driver;
	          TakesScreenshot t1 =  driver;
	          
	         File Source =  t1.getScreenshotAs(OutputType.FILE);
	                                                                                           //new classname().getClass+".png"
	         File Destination = new File("C:\\Users\\Lenovo\\Desktop\\ScreenShot1\\Amazon.png"+new UniqueScreenShot().getClass()+".png");
	
	         FileHandler.copy(Source, Destination);
	         
	}

}
