package assignment122;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//WAP to launch Amazon and on search text field search for 10 Products Using data driven testing?

public class DataDriven_Amazon

{
   @Test(dataProvider ="inputs")
   public void method(String input)
   {
        WebDriver driver = new ChromeDriver();
        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
       // e1.sendKeys(input+Keys.ENTER);
       
        e1.sendKeys(input+Keys.ENTER);
   }
   
   @DataProvider(name = "inputs")
   public Object[][] data()
   {
	   Object[][] d1 = {{"Women Watches"},{"Lipsticks"},{"Kurties"},{"perfumes"},{"Shampoo"},{"Travel Bags"},{"Lives's purse"},{"Night Suits"},{"Nike's shoes"},{"Snekers"},{"Addida sport shoes"}}; 
      
	   return d1;
   
   }
   
	
	
	
}
