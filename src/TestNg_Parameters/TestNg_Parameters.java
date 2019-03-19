package TestNg_Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Parameters {

	WebDriver driver;
	
		@Test (groups="Initiate")
		@Parameters({"Email", "Password" ,"Browser"})
		public void Parameter_Testing(String Email, String Password , String Browser) {
			
			if(Browser.equals("Mozilla")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	     driver= new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}
			else if (Browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize(); //max window
			
			}
			
		driver.get("https://opensource-demo.orangehrmlive.com/index.php"); //Enter Url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.id("txtUsername")).sendKeys(Email); //Username
		driver.findElement(By.id("txtPassword")).sendKeys(Password); //Password
		
		//driver.findElement(By.id("btnLogin")).click();  //click
		
		
		}
		
//		@AfterMethod
//		public void Teardown() {
//			driver.quit();
//		}
	}


