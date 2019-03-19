package Ashish_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Frames {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
		 // to get all frames
		List Totalframes= driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames are " +Totalframes.size());
		
		for(int i=0; i<=Totalframes.size(); i++) {
			driver.switchTo().frame(i);
			WebElement s = driver.findElement(By.xpath("//div[@class='_3ac-']"));
			if(s.equals("Learnmore")) {
				s.click();
			}else
				break;
		}
	       driver.switchTo().defaultContent();	
		
		

	}

}
