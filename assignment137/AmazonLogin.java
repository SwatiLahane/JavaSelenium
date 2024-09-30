package assignment137;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin 
{
	//WAP to check the behavior by logging into Amazon and fetching an Empty cell?

      
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumAssignments\\src\\AmazonSheet\\AmazonLogin.xlsx");
	
		  Workbook w1  =  WorkbookFactory.create(f1);
          
   	   String Username = w1.getSheet("AmazonLogin").getRow(1).getCell(3).getStringCellValue();
          
   	   System.out.println(Username);
   	   String Passwrd =  w1.getSheet("AmazonLogin").getRow(1).getCell(4).getStringCellValue();
         
   	   System.out.println(Passwrd);
   	   
   	   
   	   //For browser launching
   	        ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			WebElement un = driver.findElement(By.id("ap_email"));
			
			un.sendKeys(Username);
			
			WebElement btn = driver.findElement(By.id("continue"));
			btn.click();
			
			WebElement password = driver.findElement(By.id("ap_password"));
		    password.sendKeys(Passwrd); 
		    
		    WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
		    
		    signinButtn.click();
		    
		    
	}

	
	//O/p It will give NullPointerException
	
	
}
