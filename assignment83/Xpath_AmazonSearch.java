package assignment83;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_AmazonSearch {
       
	//Write an X path for Amazon Search
	
	public static void main(String[] args)
	{
	    
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("twotabsearchtextbox"));
		
	
    }

}
