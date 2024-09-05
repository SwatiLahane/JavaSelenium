package assignment99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggetion {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        
		e1.sendKeys("shoe");
		
		List<WebElement> li = driver.findElements(By.xpath("//div[class = 'two-pane-results-container']/div/div"));
		
		int count  = li.size();
		System.out.println(count);
		
		li.get(count-4).click();
		
		driver.close();
	}

}
