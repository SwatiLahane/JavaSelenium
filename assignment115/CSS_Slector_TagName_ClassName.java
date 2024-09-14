package assignment115;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Slector_TagName_ClassName {
 //Goto google and locate search field with the help of tagname and classname in Css selector and then enter Grotechminds.
	public static void main(String[] args)
	{
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.cssSelector("textarea.gLFyf"));
		
		e1.sendKeys("Grotechminds"+Keys.ENTER);

	}

}
