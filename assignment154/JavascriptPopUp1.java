package assignment154;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopUp1 
{
   public static void main(String arg[])
   {
	   
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://grotechminds.com/alert/");
	   
	  
	   WebElement w1  = driver.findElement(By.linkText("Received1"));
	   w1.click();
	   
	   driver.switchTo().alert().accept();
	   String s =  driver.switchTo().alert().getText();
		 System.out.println(s);
	
   
   }
}
