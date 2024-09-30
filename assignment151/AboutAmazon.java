package assignment151;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutAmazon 
{
	//Launch Amazon and scroll uptil point where About Amazon is visible?
     
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement  e = driver.findElement(By.linkText("About Amazon"));
		
		Point pi = e.getLocation();
		
		int x = pi.getX();
		int y =pi.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		Thread.sleep(2000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("windows.scrollBy(0+"+y+")");
		
		
	}
	
}
