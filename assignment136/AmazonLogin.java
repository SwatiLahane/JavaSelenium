package assignment136;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP to check the behavior by logging into Amazon and passing the wrong location of the Excel sheet?
public class AmazonLogin 
 {
       
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("D:\\Users\\Lenovo\\Desktop\\Java\\SeleniumAssignments\\src\\AmazonSheet\\AmazonLogin.xlsx"); 
		
		Workbook w1 = WorkbookFactory.create(f1);
		
		String Uname  = w1.getSheet("AmazonLogin").getRow(1).getCell(0).getStringCellValue();
		
		String Pass = w1.getSheet("AmazonLogin").getRow(1).getCell(1).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement e1 = driver.findElement(By.id("ap_email"));
		
		e1.sendKeys(Uname);
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
	    password.sendKeys(Pass); 
	    
	    WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
	    
	    signinButtn.click();
  
	
	}
	
	//O/p  :FileNotFoundException
 }
