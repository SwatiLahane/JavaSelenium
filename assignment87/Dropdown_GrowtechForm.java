package assignment87;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_GrowtechForm {
     
//Assignment 87  Automate dropdowns Skills, Country and Religion in the below page https://grotechminds.com/registration/ 
	
	public static void main(String[] args) 
	{
		
		

		
		    ChromeDriver driver = new ChromeDriver();
			driver.get("https://grotechminds.com/registration");
			
			WebElement e1 = driver.findElement(By.id("Skills"));
	        
			Select s1 = new Select(e1);
			
			//s1.selectByValue("Technical Skills");
			//s1.selectByIndex(1);
			s1.deselectByVisibleText("select1");
		   
			WebElement e2 = driver.findElement(By.id("Country"));
			Select s2 = new Select(e1);
			
			//s2.selectByValue("India");
			
			//s2.selectByVisibleText("India");
			
			s2.deselectByIndex(7);
			
			
			WebElement e3 = driver.findElement(By.id("Relegion"));
			Select s3 = new Select(e3);
			
			s3.selectByValue("Hindu");
			//s3.deselectByVisibleText("Hindu");
		//	s3.deselectByIndex(0);
			
			
		
	}

}
