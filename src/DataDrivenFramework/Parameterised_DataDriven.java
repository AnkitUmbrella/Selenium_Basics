package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.utility.Xls_Reader_Naveen;

public class Parameterised_DataDriven {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch Browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	     WebDriver driver= new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get("https://reg.ebay.in/reg/PartialReg");
	     
	     
	     //Read Data
	     // Create Object of xls_reader class from utility to connection.
	     Xls_Reader_Naveen reader= new Xls_Reader_Naveen("D://temp//TestData.xlsx");
	     int rowcount= reader.getRowCount("DataTestNg"); //Get rowcount
	     
	     
	   //Add column name to existing sheet
		    reader.addColumn("DataTestNg","Status");
	      
	      //Read data by for loop rows and columns
	      // we are reading with row no. 2 , <= as we want 5th row also
	      //Parameterizarion
	     for(int i=2; i<=rowcount; i++) {  
	    	 System.out.println("------------");
	    	String Firstname= reader.getCellData("DataTestNg", "Firstname", i); 
	    	 System.out.println(Firstname);
	    	  
	    	 String Lastname=reader.getCellData("DataTestNg", "Lastname", i);
	    	 System.out.println(Lastname);
	    	 
	    	 
	    	 String Email= reader.getCellData("DataTestNg", "Email", i);
	    	 System.out.println(Email);
	    	 
	    	 
	    	 String Password= reader.getCellData("DataTestNg", "Password", i);
	    	 System.out.println(Password);
	    	 
	    	 
	    
         //Webdriver code	 
	     driver.findElement(By.id("firstname")).clear(); 
    	 driver.findElement(By.id("firstname")).sendKeys(Firstname);
    	 Thread.sleep(3000);
    	 
    	 driver.findElement(By.id("lastname")).clear();
    	 driver.findElement(By.id("lastname")).sendKeys(Lastname);
    	 Thread.sleep(3000);
    	 
    	 driver.findElement(By.id("email")).clear();
    	 driver.findElement(By.id("email")).sendKeys(Email);
    	 Thread.sleep(3000);
    	 
    	 driver.findElement(By.id("PASSWORD")).clear();
    	 driver.findElement(By.id("PASSWORD")).sendKeys(Password);
    	 Thread.sleep(3000);
    	 
    	//driver.findElement(By.xpath("//input[@type='submit']")).click(); //register button click
    	 
    	//Add data in latest colmn
	     reader.setCellData("DataTestNg","Status", i,"Pass");
    	 
     }
	     
	}
	    	
}
	

