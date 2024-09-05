package assignment97;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_AccountAndList {

	//Launch amazon, hover over account & list and click on sign in
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		//span[@id='id="nav-link-accountList-nav-line-1"']   
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		
		WebElement e2 = driver.findElement(By.xpath("//span[.='Sign in']"));

		e2.click();
		
		
	}

}
