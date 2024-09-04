package assignment74;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonSigninButton {
      //on you tube click on sign in button
	public static void main(String[] args) 
	{
		ChromeDriver  driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=youtube+login&oq=youtube+login&aqs=chrome..69i57.5512j0j1&sourceid=chrome&ie=UTF-8");
        
		WebElement e1 = driver.findElement(By.className("class"));
		
		e1.click();
		
	} 

}
