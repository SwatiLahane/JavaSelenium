package assignment107;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links {
     
	
	//WAP to print the text of all the links of a given website?
	public static void main(String[] args) 
	{
	    
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");  
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.linkText("a"));
		
		System.out.println(li.size());
		
		for(int i = 0; i < li.size(); i++)
		{
			 WebElement e  = li.get(i);
			 
			String url =  e.getAttribute("href");
			System.out.println(url);
			
			String text = e.getText();
			System.out.println(text);
		}
		
	
	}

}
