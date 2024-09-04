package assignment91;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_RegistrationApp {
    
// https://grotechminds.com/automate-me/, hoverover Registration application
	
	public static void main(String[] args) 
	{
	         
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//div[@class ='elementor-flip-box__layer__overlay'] "));
	     
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2 = driver.findElement(By.className("elementor-flip-box__button elementor-button elementor-size-sm"));
		
		e2.click();
		driver.close();
		

	}

}
