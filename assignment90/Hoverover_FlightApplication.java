package assignment90;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//On  https://grotechminds.com/automate-me/, hoverover flight application and click on Read more


public class Hoverover_FlightApplication {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//div[@class='elementor-flip-box__layer__overlay']"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		
		WebElement e2 = driver.findElement(By.xpath("//a[@class='elementor-flip-box__button elementor-button elementor-size-sm']"));
        e2.click();  
        

	}

}
