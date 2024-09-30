package assignment135;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_DataFetching 
{
	//WAP to log into Amazon and fetch the values of username and password from an Excel Sheet?
	
       @Test 
       public void AmazonLogin() throws EncryptedDocumentException, IOException
       {
    	  
    	   FileInputStream f2 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumAssignments\\src\\AmazonSheet\\AmazonLogin.xlsx");
    	   Workbook w1  =  WorkbookFactory.create(f2);
            
    	   String Username = w1.getSheet("AmazonLogin").getRow(1).getCell(0).getStringCellValue();
           
    	   System.out.println(Username);
    	   String Passwrd =  w1.getSheet("AmazonLogin").getRow(1).getCell(1).getStringCellValue();
          
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

}
