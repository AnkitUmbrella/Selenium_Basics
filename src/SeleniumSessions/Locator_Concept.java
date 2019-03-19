package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F"); //Enter Url
		
	//	1. Xpath:-> 2nd priority
		//Absolute path should not be used.
		// FRelative xpath can be used.
		// FindElement is a method in webdriver.
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("TOM");
//		
//		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("TOM");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
		
		
		// 2. ID->1st priority
		driver.findElement(By.id("firstname")).sendKeys("test");
		
		//3. NAME -> 3rd priority
	//	driver.findElement(By.name("email")).sendKeys("Sam@gmail.com");
		
		//4. By linktext-> for links
		// driver.findElement(By.linkText("Create a business account")).click();
		
		//5. By partial link text not useful. Used when link text is long.
		 //driver.findElement(By.partialLinkText("business"));
		 
		 //6. CSS SELECTOR-> 2nd priority
		//if id is there so css selector will be #{idvalue}
		//if id is not there but class is there then .{classname}
		 driver.findElement(By.cssSelector("#email")).sendKeys("haha@gmail.com");
		driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("12345");
		
		//7. By classname (not useful-> classname can be duplicate)-> 4th priority
		driver.findElement(By.className("classname")).click();
		 
		

	}

}
