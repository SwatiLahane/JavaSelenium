package assignment139;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin
{
	
//	WAP to log into Amazon and fetch the values of Numeric username and String password from an Excel Sheet?  
	
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{ 
		
	
		     FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
		    
			 Workbook w1 = WorkbookFactory.create(f1);
		                                                             
			 String username = w1.getSheet("Login_Details").getRow(2).getCell(0).getStringCellValue();
			 System.out.println(username);
		     
			 // To fetch Numeric value
		     String passwrd = NumberToTextConverter.toText(w1.getSheet("Login_Details").getRow(2).getCell(1).getNumericCellValue());
		     System.out.println(passwrd );
			   

	     
		    ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			WebElement un = driver.findElement(By.id("ap_email"));
			
			un.sendKeys(username );
			
			WebElement btn = driver.findElement(By.id("continue"));
			btn.click();
			
			WebElement password = driver.findElement(By.id("ap_password"));
		    password.sendKeys(passwrd); 
		    
		    WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
		    
		    signinButtn.click();
	    
	}
	
}
