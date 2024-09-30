package assignment134;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Fetch_Data_FromExcellSheet 

//WAP to fetch the values from an Excel Sheet?
{   
       @Test 
       public void login() throws EncryptedDocumentException, IOException
       {
    	   FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumAssignments\\SwatiSheet\\Excell_Sheet.xlsx");
    	   
           Workbook w1 = WorkbookFactory.create(f1); //open the xcell sheet f1 
           
           String un = w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
           System.out.println(un);
           
           String pass = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
           System.out.println(pass);
           
       
       }
	 
	
}
