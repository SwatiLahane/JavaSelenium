package assignment108;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args)
	{
	     //WAP to handle broken links in a given website?
		
		 
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		
		for(int i = 0;  i < l1.size(); i++)
		{
			WebElement e= l1.get(i);
			String url = e.getAttribute("href");
			
		}
		
	}
	static void verify_the_link(String url) throws IOException 
	{
		
		try
		{
			
		  URL u1 = new URL(url);
		
		  HttpURLConnection u2 =  (HttpURLConnection) u1.openConnection();
		
		  if(u2.getResponseCode() == 200)
		  {
			System.out.println("Valid Links"+u2.getResponseMessage() +" "+u2.getResponseCode());
		  }
		 else
		 {
		   System.out.println("Its Not Valid Link"+u2.getResponseMessage() + " "+u2.getResponseCode());
		 }
	}
		
     catch(MalformedInputException m1)
      {
    	 
	   System.out.println("Handle It");
      
      }
	
}

}	
	
	