package assignment105;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UniqueScreenShot {
	
	
	//WAP to take a unique screenshot using Math.random().
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	   
		
		ChromeDriver driver= new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.firstcry.com/");
	     
	     WebElement e1 = driver.findElement(By.id("search_box"));
	     
	     e1.sendKeys("Girls"+Keys.ENTER);
	     
	     Thread.sleep(2000);
	     
	     TakesScreenshot t1 = driver;
	     File Source = t1.getScreenshotAs(OutputType.FILE);
	     
	     File Destination  = new File("C:\\Users\\Lenovo\\Desktop\\ScreenShot1\\firstcry.png"+Math.random()+".png");
	     
	     FileHandler.copy(Source,Destination);
	     
	     
	     
	     
	}

}
