package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader_Naveen;

public class RegisterEbay_DataProvider {

   WebDriver driver;	
	
   
  @Test 
  public void Register() {
	
      System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	     driver= new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("https://reg.ebay.in/reg/PartialReg");
	
	    	
	    	 //use xls_reader utility and create object of xls_reader
	    	 
	    	 Xls_Reader_Naveen reader= new Xls_Reader_Naveen("D://temp//TestData.xlsx");
	    	 String Firstname=  reader.getCellData("DataTestNg", "Firstname", 2);
	    	 System.out.println(Firstname);
	    	 
	    	 
	    	 String Lastname=reader.getCellData("DataTestNg", "Lastname", 2);
	    	 System.out.println(Lastname);
	    	 
	    	 
	    	 String Email= reader.getCellData("DataTestNg", "Email", 2);
	    	 System.out.println(Email);
	    	 
	    	 
	    	 String Password= reader.getCellData("DataTestNg", "Password", 2);
	    	 System.out.println(Password);
	    	 
	    	 
	    	 // Read first row and pass data as in below:->

	    	 driver.findElement(By.id("firstname")).sendKeys(Firstname);
	    	 driver.findElement(By.id("lastname")).sendKeys(Lastname);
	    	 
	    	 driver.findElement(By.id("email")).sendKeys(Email);
	    	 
	    	 driver.findElement(By.id("PASSWORD")).sendKeys(Password);
	    	 
	    	// driver.findElement(By.xpath("//input[@type='submit']")).click(); //register button click
	    	 
	    	 
	    	 
	     }
	

     @AfterTest
      public void Teardown() throws InterruptedException {
    	  Thread.sleep(5000);
    	 driver.quit();
      }

}
