package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/"); //Enter Url
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// Switch to Frame
//		driver.switchTo().frame(0);
//		Thread.sleep(5000);
//		System.out.println(driver.getTitle());
		
		
		//Listall frames
		List f= driver.findElements(By.tagName("iframe"));
           System.out.println(f.size());
	}

}
