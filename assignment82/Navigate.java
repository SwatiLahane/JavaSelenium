package assignment82;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
//	Launch Browser by navigate method and perform forward,backword, refresh actions

	public static void main(String[] args) throws InterruptedException 
	{
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.navigate().to("https://www.google.com");
	    driver.manage().window().maximize();
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    driver.close();
	    
	    
	}

}
