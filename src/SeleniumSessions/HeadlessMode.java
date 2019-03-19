package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessMode {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		//Html unit driver is not available in selenium 3x version
		// Download the jar file and import the dependencies
       /* Advantages of HtmlUnitDriver:
+Test execution using HtmlUnitDriver is very fast. Since it is the fastest implementation of Selenium WebDriver.
+Being headless and fast, it is an ideal choice for web scrapping.
+Its browser - htmlUnit is Java based. Hence, it is platform independent.
+It also supports JavaScript execution through in-built Rhino javascript engine.
========================================================
Limitations of HtmlUnitDriver:

-Being non-GUI makes it difficult to create scripts and debug issues while scripting.
-The Rhino javascript engine of HtmlUnitDriver makes it unsuitable to emulate other popular browser's javascript behaviour.
*/
		WebDriver driver= new HtmlUnitDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com"); //Enter Url
		
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("ankit_rox2002@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("****");
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

}
