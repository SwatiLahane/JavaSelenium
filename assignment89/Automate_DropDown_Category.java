package assignment89;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Assignment 89 Automate Category Dropdowns in Amazon.in
public class Automate_DropDown_Category {
    
	
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));

	}

}
