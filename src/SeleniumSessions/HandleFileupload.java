package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileupload {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://html.com/input-type-file/"); //Enter Url
		Thread.sleep(5000);
		
		// click on browser button
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\uipl-dev\\Pictures\\IMAGES\\SampleGIFImage_350kbmb.gif");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

}
