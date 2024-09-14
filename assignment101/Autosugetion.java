 package assignment101;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Autosugetion {
         
	// WAP to launch the Apollo pharmacy and search for "PCM" and select the fourth option by using AutoSuggestio
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.className("SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq"));
        
		e1.sendKeys("Dolo-650"+Keys.ENTER);
		
		
		ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		
		WebElement searchinitial=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		searchinitial.click();
		WebElement searchFinal=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		Thread.sleep(2000);
		searchFinal.sendKeys("PCM");
		
		Thread.sleep(2000);
		
		List<WebElement> pro=driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		System.out.println(pro.size());
		Thread.sleep(3000);
		pro.get(2).click();
		
		
		
		Date d1 = new Date();
		d1.getTime();
		Date d2 = new Date(d1.getTime());
		String time =d2.toString();
		String date =time.substring(8,10);
		String month = time.substring(4,7);
		String year=time.substring(time.length()-4);
		String exactTime = time.substring(11,19);
		String correctTime=exactTime.replace(":", "_");
		String dateFormat1= date.concat(month).concat(year).concat(correctTime);
		
		
	
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\Apolo"+dateFormat1+".png");
		FileHandler.copy(source, destination);
		
		
	} 

  }
	



