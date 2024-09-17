package assignment121;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//WAP to launch multiple browsers using WebDriver Interface

public class Multiple_Browsers
{
     WebDriver driver;
     
	@Test
	public void mathod()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Type 1 for Launching chrome Browser");
	    System.out.println("Type 2 for Launching Firefox browser");
	    System.out.println("Type 3 for Launching Edge Browser");
	    
	    int ino = sobj.nextInt();
	    
	    if(ino == 1)
	    {
	    	 new ChromeDriver();
	    }
		if(ino == 2)
		{
			new FirefoxDriver();
		}
	  
	    if(ino == 3)
	    {
	    	new EdgeDriver();
	    }
	
	}
}
