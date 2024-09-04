package assignment81;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Cat_ArrowDown {
       
	
//	write an xpath  for amazon select the category and select 3rd or 4th option.
	
	public static void main(String[] args)
	{
	    
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=8282926572702359832&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302986&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id= 'searchDropdownBox']"));
	    
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		
       driver.close(); 
		
		
	}

}
