package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/"); //Enter Url
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Explicit wait for the specific element once the element is available
		
		// webdriver wait is a class
		WebDriverWait wt = new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		
		
		System.out.println("Id is available");

	}

}
