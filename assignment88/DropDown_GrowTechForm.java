package assignment88;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_GrowTechForm {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form");
		
		
		WebElement e1 = driver.findElement(By.id("gender"));
		
		Select s1 = new Select(e1);
		
		//s1.selectByIndex(1);
	//	s1.selectByValue("female");
		s1.selectByVisibleText("Female");
		
		
		WebElement e2 = driver.findElement(By.id("state"));
		
		Select s2 = new Select(e2);
		s2.deselectByVisibleText("Maharashtra");
		
		

	}

}
