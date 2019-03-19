package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {
		
	
		ChromeOptions cr= new ChromeOptions();
		cr.addArguments("headless");
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
		//Pass chromeoptions in chromedriver 
		
		WebDriver driver= new ChromeDriver(cr);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
        driver.get("https://www.google.com"); //Enter Url
		System.out.println(driver.getTitle());
				
				
				

}

	
}