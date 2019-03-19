package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_PrecedingConcept {

	public static void main(String[] args) {
		// https://www.browserstack.com/contact
		
		//Webtable Method -2 -preceding concept
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
		driver.get("https://www.browserstack.com/contact"); //Enter Url
		
		
		
		//driver.findElement(By.xpath("//input[@id='support-name']")).sendKeys("test");
		
	
		 driver.findElement(By.xpath("//input[contains(@id,'support-name')]"));
		  
		
		
		

	}

}
