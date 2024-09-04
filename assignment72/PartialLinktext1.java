package assignment72;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext1 {

	public static void main(String[] args)
	{
       
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		WebElement partiallink = driver.findElement(By.partialLinkText("Deals"));
		
		partiallink.click();

	}

}
