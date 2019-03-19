package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/"); //Enter Url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Handle dropdown
		Select s= new Select(driver.findElement(By.xpath("//select[@id='day']")));
		s.selectByVisibleText("6");
		s= new Select(driver.findElement(By.xpath("//select[@id='month']")));
		s.selectByVisibleText("Jun");
		
		
		
		
		
		

	}

}
