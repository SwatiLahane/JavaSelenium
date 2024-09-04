package assignment69;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_Form {

	public static void main(String[] args)
	{
		
		
		    ChromeDriver driver = new ChromeDriver(); //Launch empty browser
			
			driver.get("https://grotechminds.com/registration"); 
			
			driver.manage().window().maximize(); 
			
			WebElement firstname = driver.findElement(By.name("fname"));
			
			firstname.sendKeys("swati");
			
			WebElement lastname = driver.findElement(By.name("lname"));
			
			WebElement Emailid = driver.findElement(By.id("email"));
			Emailid.sendKeys("lahaneswati10@gmail.com");
			
			
			WebElement Number = driver.findElement(By.id("password"));
			Number.sendKeys("absc@34");
			
			
			WebElement e6 = driver.findElement(By.id("Present-Address")); //Present-Address
			e6.sendKeys("pune");
			
			
			WebElement permenentAdd = driver.findElement(By.id("Permanent-Address"));
			permenentAdd.sendKeys("Pune");
			
				
			
			WebElement pincode = driver.findElement(By.name("Pincode"));
			pincode.sendKeys("431507");
		    
			WebElement checkbox = driver.findElement(By.id("relocate"));
			checkbox.click();
			
			WebElement Submit = driver.findElement(By.name("Submit"));
			Submit.click();
			
			//driver.findElement(By.name("Submit"+Keys.ENTER));
			//Submit.click();
			
			
			driver.close();
	}

}
