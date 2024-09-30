package assignment146;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HeadlessBrowser
{
     
	// WAP to run any browser in headless mode?

	WebDriver driver;    
	@Test (dataProvider = "inputs")
	public void Method(String input)
	{
		EdgeOptions options = new EdgeOptions(); //create an object to run in headless mode
	    
	   
	    options.addArguments("--headless"); // pass argument
	    
	    driver  = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		WebElement Search = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		Search.sendKeys(input+Keys.ENTER);
		//Thread.sleep(4000);
	
	 
}	

	@DataProvider(name = "input")
	public Object[][] data1()
	{
		return new Object[][] {{"How to become president"},{"How to be spiritual"},{"Pune"},{"Banglore"}};
	}


	

}
