package assignment79;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TextMessage {
    
	
//	write the xpath with help of text message search mobile on the flipkart.
	
	public static void main(String[] args)
	{
	    
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		WebElement e1 = driver.findElement(By.xpath("(//span[.='Mobile'])[2]"));
		e1.click();

	}

}
