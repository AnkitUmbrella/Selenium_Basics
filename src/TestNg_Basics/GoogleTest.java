package TestNg_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

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
	@Test (priority=4, groups="launch")
	public void LaunchUrl() {
		System.out.println(driver.getTitle());
	}
	
	@Test (priority=1, groups="launch")
	public void Button() {
		boolean s= driver.findElement(By.name("btnK")).isDisplayed();
		System.out.println(s);
	}
	
	@Test (priority=2, groups="click")
	public void Text() {
	  driver.findElement(By.name("q")).sendKeys("fedde le grand");
		
	}
	
	@Test (priority=3 , groups="random")
	public void Test1() {
	 System.out.println("Test1");
		
	}
	
	@Test ()
	public void Test2() {
		System.out.println("title 2");
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
}
