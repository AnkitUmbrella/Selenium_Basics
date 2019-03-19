package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader_Naveen;

public class Testing_DD {

	 WebDriver driver;
	
		 //Launch Browser
	 
		     @Test
		     public void rediff() throws InterruptedException {
		 	 System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		     driver = new FirefoxDriver();
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  driver.get("https://reg.ebay.in/reg/PartialReg");
		
		
		
             /*    //Read XLS file and pass single data value in webdriver script
			     
			     Xls_Reader_Naveen reader= new Xls_Reader_Naveen("D:\\temp\\TestData.xlsx");
			     
			    String firstname= reader.getCellData("DataTestNg", "Firstname", 2);
			     System.out.println(firstname);
			     
			     String lastname= reader.getCellData("DataTestNg", "Lastname", 3);
			     System.out.println(lastname);
			     
			     */
			  
			  
			  
			   //Passing multiple data set values or Parameterization 
			  
			  Xls_Reader_Naveen reader= new Xls_Reader_Naveen("D:\\temp\\TestData.xlsx");
			  int rowcount= reader.getRowCount("DataTestNg"); //Rowcount  
			  
			  //Add column name to existing sheet
			    reader.addColumn("DataTestNg","Status");
     
			  for(int i=0; i<=rowcount; i++) {
			    String firstname= reader.getCellData("DataTestNg", "Firstname", i);
			     System.out.println(firstname);
			     
			     String lastname= reader.getCellData("DataTestNg", "Lastname", i);
			     System.out.println(lastname);
			     
			  
			  
			     
			     //Registration page and mention .clear before 
			     driver.findElement(By.id("firstname")).clear();
			     driver.findElement(By.id("firstname")).sendKeys(firstname);
			     Thread.sleep(1000);
			     
			     driver.findElement(By.id("lastname")).clear();
			     driver.findElement(By.id("lastname")).sendKeys(lastname);
			     Thread.sleep(1000);
			     
			     //Add data in latest colmn
			     reader.setCellData("DataTestNg","Status", i,"Pass");
	}
		     }
		     
		     @AfterTest
		      public void Teardown() throws InterruptedException {
		    	  Thread.sleep(3000);
		    	 driver.quit();
		      }

}
