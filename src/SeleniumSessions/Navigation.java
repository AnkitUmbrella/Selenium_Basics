package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		//get() vs navigate.to()
		//So the main difference between get() and navigate() is, both are performing the same task 
		//but with the use of navigate() you can move back() or forward() in your session's history. 
		//navigate() is faster than get() because navigate() does not wait for the page to load fully or completely.
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.facebook.com");
         System.out.println(driver.getTitle());
         
         Thread.sleep(3000);
         driver.navigate().to("https://www.amazon.in");
         System.out.println(driver.getTitle());
         
         Thread.sleep(3000);
         driver.navigate().back();
         System.out.println(driver.getTitle());
         
         Thread.sleep(7000);
         driver.navigate().forward();
         System.out.println(driver.getTitle());
         
	}

}
