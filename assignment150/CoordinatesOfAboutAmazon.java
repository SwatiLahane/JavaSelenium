package assignment150;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoordinatesOfAboutAmazon 
{
	//Launch Amazon and find out the Coordinates of About Amazon?
	
	public static void main(String args[])
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement e1 = driver.findElement(By.linkText("About Amazon"));
		
	    Point pi	= e1.getLocation();
	    
	    int x = pi.getX();
	    int y = pi.getY();
	    
	    System.out.println(x); //Coordinates of x 
	    System.out.println(y); //coordinates of y
	    
	    
	}
}
