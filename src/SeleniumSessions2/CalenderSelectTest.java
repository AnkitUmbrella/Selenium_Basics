package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelectTest {

	public static void main(String[] args) throws InterruptedException {
		
		//*************** PENDING ******************************
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		
		//click on calender
		driver.switchTo().frame("viewport");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).click();

		
		String d="18-october-2017";
		String date[]= d.split("-");
		 String day= date[0];
		 String month= date[1];
		 String year= date[2];
		 
		 driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
		
		
		

	}

}
