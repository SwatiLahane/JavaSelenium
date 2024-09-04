package assignment73;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectDisableButton {

	public static void main(String[] args)
	{
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://digital.idfcfirstbank.com/apply/savings?&utm_source=google&utm_medium=cpc&utm_campaign=15702461166&adgroup=128499038821&utm_term=idfc&utm_content=617235743996&network=g&gad_source=1&gclid=CjwKCAjwuMC2BhA7EiwAmJKRrORjFDL5uslLvsOfEFd4hMETlo6GHRhpS1J5x6RtjFiDdfvFN6bD4RoCzcQQAvD_BwE&gclsrc=aw.ds");
		
		WebElement mn = driver.findElement(By.name("mobileNumber"));
		mn.sendKeys("9123448559");
		
        WebElement pd = driver.findElement(By.id("panNumber"));
		pd.sendKeys("Adress colony road no53 ");
		
		 WebElement adharNo = driver.findElement(By.id("aadhaar"));
	     pd.sendKeys("945790283944333");
		
		
	}

}
