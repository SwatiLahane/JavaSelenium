package assignment140;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//WAP to login to FB with two set of data using both the data provider concept and fetching values from excel sheet concept 
//i.e. from Excel sheet pass the values of un and pwd into pgm?

public class FacebookLogin
{       
	 WebDriver driver;
		 
	 
	@Test(dataProvider = "logindata")
	
	public void login(String username, String passwrd) 
	{    
		
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/"); 
		 
		WebElement UName  = driver.findElement(By.id("email"));
		UName.sendKeys(username);
		
		WebElement Pass  = driver.findElement(By.id("pass"));
		Pass.sendKeys(passwrd);
		
		WebElement bttn  = driver.findElement(By.id("login"));
		bttn.click();
		
	}
	
	//(Pass valid credential while login)
	@DataProvider(name = "logindata")
	public Object[][] data() throws EncryptedDocumentException, IOException
	{     
		
		
        FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumAssignments\\FBDataFetching\\Swati's Sheet.xlsx");
	    
		Workbook w1 = WorkbookFactory.create(f1);
	    
		String uname = w1.getSheet("FBLogin").getRow(1).getCell(0).getStringCellValue();
		System.out.println(uname);
		
	    
		String pass = w1.getSheet("FBLogin").getRow(1).getCell(1).getStringCellValue();
	
	
	    System.out.println(pass );
		
		
		
		Object[][] d1 = new Object[1][1];
		
		d1[0][0] = uname; //valid email id
		d1[0][1] = pass; //valid passwrd
		
		//d1[1][0] = ;  //valid mobile num
		//d1[1][1] = "swati_123"; //valid pass
		
		return d1;
		
		
	}
}
	