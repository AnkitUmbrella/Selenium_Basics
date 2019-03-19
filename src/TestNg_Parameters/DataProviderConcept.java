package TestNg_Parameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.utility.UtilityFile;

public class DataProviderConcept {

	WebDriver driver;
	
	
	//Launch Browser
	@BeforeTest
	public void dataproviderTest() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		     driver= new FirefoxDriver();
		     driver.manage().deleteAllCookies();
		     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		     driver.get("https://reg.ebay.in/reg/PartialReg");

	
}
	
	@DataProvider
	public Iterator<Object[]> getdata() {
		
	ArrayList<Object[]> ar= UtilityFile.getdatafromExcel();	
		return ar.iterator();
	}

	
	
	
	@Test(dataProvider="getdata")
	public void script(String Firstname, String Lastname, String Email, String Password  ) throws InterruptedException {
		
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
		
	}
	
	

	
	
}