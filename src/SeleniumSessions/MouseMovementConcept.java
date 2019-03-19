package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
	
		
       //Mouse movements
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/"); //Enter Url
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		
		//Actions classes
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Flights"))).build().perform();
		Thread.sleep(3000); // thread sleep
		a.click().build().perform();
		
		
				

	}

}
