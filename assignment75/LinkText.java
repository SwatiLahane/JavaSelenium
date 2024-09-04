package assignment75;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
       
	
	//goto firstcry.com click on boy fasion n use link text
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		WebElement e1 = driver.findElement(By.linkText("BOY FASHION"));
		
		e1.click();

	}

}
