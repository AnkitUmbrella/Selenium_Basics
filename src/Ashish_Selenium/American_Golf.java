package Ashish_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class American_Golf {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Also called Dynamic Wait
		// If element is visible within 2 sec then rest of sec will be ignored.
		
		//Thread.sleep(2000); // wait for 2 sec we should avoid thread.sleep
		driver.get("https://www.americangolf.co.uk/");
		WebElement golfclubs= driver.findElement(By.linkText("Golf Clubs"));
		
		Actions act = new Actions(driver);
		act.moveToElement(golfclubs).build().perform();
		
		WebDriverWait wt= new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOf(golfclubs));
		
		
		
		
//		Thread.sleep(5000);
//		WebElement box = driver.findElement(By.xpath("//div[@class='level-2 flyout']"));
//		   List ele= driver.findElements(By.tagName("a"));
//		   System.out.println(ele.size());

	}

}
