package assignment105;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UniqueScreenShot1 {
      
	
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		WebElement e1 = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]"));
		
		e1.sendKeys("Watches");
		
		List<WebElement> li = driver.findElements(By.xpath("(//div[@class = 'left-pane-results-container']/div/div)[1]"));
		
		System.out.println(li.size());
		li.get(3).click();
		
		
		ChromeDriver t1 = driver;
		
		File Source = t1.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\Lenovo\\Desktop\\ScreenShot1"+Math.random()+".png"); 
		 
		FileHandler.copy(Source, Destination);
		
	}

}
