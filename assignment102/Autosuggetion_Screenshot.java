package assignment102;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Autosuggetion_Screenshot {
         
//	WAP to launch the Amazon and search for "Shoe" and select the fourth option by using AutoSuggestion and also, take a Screenshot
	public static void main(String[] args) throws IOException 
	{
		  
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize();
        
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		
	    e1.sendKeys("Shoes");
	    
	    List<WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    
        //System.out.println(shoe.size());
		
		//shoe.get(4).click();
		
		System.out.println(driver.getTitle());
	    
	    int count =  li.size();
	    
	    System.out.println(count);
	    
	    li.get(count-7); //10-7 = 4 index start from zero
	    
	    li.get(4).click();
	    
        TakesScreenshot t1 = driver;    
        File Source = t1.getScreenshotAs(OutputType.FILE);
        File Destination = new File("C:\\Users\\Lenovo\\Desktop\\ScreenShot1\\swati.png");
        
        FileHandler.copy(Source, Destination);
	
        
	}

}
