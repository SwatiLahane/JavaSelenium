package assignment125;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//WAP to fill the registration form in grotechminds website with 5 datasets using @DataProvider annotation


public class DataDriven_GroTechReg
{
	 @Test(dataProvider = "data")
     public void RegitionOfGrowtech(String name,String surname,String passwd,String email,String paswrd,String PAddr,String PerAddr,CharSequence[] pincode)
     {
     	 
		 ChromeDriver driver = new ChromeDriver();
     	 driver.get("https://grotechminds.com/registration/");
     	 driver.manage().window().maximize();
     	 WebElement fname = driver.findElement(By.id("fname"));
     	 fname.sendKeys(name);
     	 
     	 WebElement lname = driver.findElement(By.id("lname"));
     	 lname.sendKeys(surname);
     	 
     	 WebElement email1 = driver.findElement(By.id("email"));
     	 email1.sendKeys(email);
     	 
     	 WebElement password = driver.findElement(By.id("password"));
     	 password.sendKeys(paswrd);
     	 
     	 WebElement gender = driver.findElement(By.id("Female"));
     	 gender.click();
     	 
     	 WebElement e1 = driver.findElement(By.name("Skills"));  
     	 Select s1 = new Select(e1);
     	 s1.selectByVisibleText("Technical Skills");
     	 
     	 WebElement e2 = driver.findElement(By.id("Country"));
     	 
     	 Select s2 = new Select(e2);
     	 s2.selectByValue("India");
     	 
     	 
     	 WebElement CAddress = driver.findElement(By.name("Present-Address"));
     	 CAddress.sendKeys(PAddr);
     	 
     	 WebElement PAddress = driver.findElement(By.name("Permanent-Address"));
     	 PAddress.sendKeys(PerAddr);
     	 
     	 WebElement pin = driver.findElement(By.name("Pincode"));
     	 pin.sendKeys(pincode);
     	 
     	WebElement Submit = driver.findElement(By.name("Submit"));
		Submit.click(); 
     	 
     }
	
     @DataProvider(name = "data")
     public Object[][] method()
     {                       //5 Rows 7 column
    	 Object[][] d = new Object[5][7];
    	 
    	 d[0][1] = "Swati";// first name
    	 d[0][1] = "lahane"; //last name
    	 d[0][1] = "lahaneswaati24@gmail.com"; //emailAddress
    	 d[0][1] = "swati_123"; //password
    	 d[0][1] = "Pune"; //Present Address
    	 d[0][1] = "Jalna"; //perment address
    	 d[0][1] = 431507; //pincode 
		
    	 d[1][1] = "Shakira";// first name
    	 d[1][2] = "shaikh"; //last name
    	 d[1][3] = "emailtoshakira@gmail.com"; //emailAddress
    	 d[1][4] = "shakira_123"; //password
    	 d[1][5] = "canada"; //Present Address
    	 d[1][6] = "india"; //perment address
    	 d[1][7] = ""; //pincode 
		
    	 d[2][1] = "arav";// first name
    	 d[2][2] = "lahane"; //last name
    	 d[2][3] = "aravlahane@gmail.com"; //emailAddress
    	 d[2][4] = "Araav_123"; //password
    	 d[2][5] = "Jalna"; //Present Address
    	 d[2][6] = "Jalna"; //perment address
    	 d[2][7] = "431507"; //pincode 
		
    	 
    	 d[3][1] = "priya";// first name
    	 d[3][2] = ""; //last name
    	 d[3][3] = "lahaneswaati24@gmail.com"; //emailAddress
    	 d[3][4] = "swati_123"; //password
    	 d[3][5] = "Pune"; //Present Address
    	 d[3][6] = "Jalna"; //perment address
    	 d[3][7] = "431507"; //pincode 
		
    	 
    	 d[4][1] = "Shrinika";// first name
    	 d[4][2] = "lahane"; //last name
    	 d[4][3] = ""; //emailAddress
    	 d[4][4] = "swati_123"; //password
    	 d[4][5] = "Pune"; //Present Address
    	 d[4][6] = "Jalna"; //perment address
    	 d[4][7] = "431507"; //pincode 
		 
    	 d[5][1] = "Disha";// first name
    	 d[5][2] = "Chauhan"; //last name
    	 d[5][3] = "disha.s.chauhan@gmail.com"; //emailAddress
    	 d[5][4] = "Disha_@123"; //password
    	 d[5][5] = "Ahmadabad"; //Present Address
    	 d[5][6] = "india"; //perment address
    	 d[5][7] = ""; //pincode 
		
    	
    	 return d; 
   }
     
}     
     
     
