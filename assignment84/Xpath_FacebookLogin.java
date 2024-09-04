package assignment84;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FacebookLogin {

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		
	    WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	    email.sendKeys("lahaneswati@gmail.com");
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@name='pass'])"));
	    pass.sendKeys("Swati#123");
	    
	    WebElement button = driver.findElement(By.xpath("//button[1]"));
	    button.click();
	    
	    driver.close();
	
	}

}
