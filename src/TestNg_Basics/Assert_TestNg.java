package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_TestNg {

	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	     driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/"); //Enter Url
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	//Tests will be executed in pair alphabetically
	@Test 
	public void LaunchUrl() {
		String exp=driver.getTitle();
		System.out.println(exp);
		Assert.assertEquals(exp , "Google123", "This is invalid test");
	}
	
	@Test 
	public void Button() {
		boolean s= driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(s);
		Assert.assertTrue(s);
	}
	
	@Test 
	public void Text() {
	  driver.findElement(By.name("q")).sendKeys("fedde le grand");
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
