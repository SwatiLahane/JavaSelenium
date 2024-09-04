package assignment85;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write an X path for facebook  create button using
//tagname[@AN='AV']
public class XPath_FacebookButton {

	public static void main(String[] args) 
	{
	 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		
	   
	    WebElement button = driver.findElement(By.xpath("//button[@id ='loginbutton' ]"));
	    button.click();
	    
	    driver.close(); //to close the browser
	}

}
