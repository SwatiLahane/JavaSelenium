package assignment98;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Autosuggetion {
     
	
	//	WAP to launch the Google and search for "Bangalore" and select the first suggestion by using AutoSuggestion 

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Banglore");
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class=\"ClJ9Yb\"]/ul/li"));
		
		int count = li.size();
		
		System.out.println(count);
		li.get(count-9);
		
		driver.close();
		
		
		
		
	}

}
