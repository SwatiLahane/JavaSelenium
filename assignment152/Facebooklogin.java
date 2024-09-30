package assignment152;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin
     
{
	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username= driver.findElement(By.name("email"));

		username.sendKeys("lahaneswati24@gmail.com");
		
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("Swati@Abc");
		
		WebElement loginbttn = driver.findElement(By.name("login"));
		
		loginbttn.click();
		
		
		
		
	}

	

}
