package assignment67;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import assignment66.EdgeBrowser;

public class LoginToFacebook {

	public static void main(String[] args) 
	{
	    ChromeDriver driver = new ChromeDriver(); //to launch empty browser
	    
	    driver.get("https://www.facebook.com"); //to nevigate to the facebook site
        driver.manage().window().maximize(); //to maximize browser
		
		WebElement username= driver.findElement(By.name("email"));

		username.sendKeys("lahaneswati24@gmail.com");
		
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("Swati@Abc");
		
		WebElement loginbttn = driver.findElement(By.name("login"));
		
		loginbttn.click();
		

	}

}
