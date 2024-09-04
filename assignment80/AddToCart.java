package assignment80;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
       
//	launch Amazon search product click on the first product and add to the  cart.
	
	public static void main(String[] args) 
	{
       
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=8282926572702359832&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302986&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		e1.sendKeys("product"+Keys.ENTER);
		
		WebElement e2 = driver.findElement(By.id("a-autoid-1-announce"));
		e2.click();
		

	}

}
