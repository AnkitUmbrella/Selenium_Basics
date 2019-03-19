package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandPopup {

	public static void main(String[] args) {
		// Javascripts popups
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //Enter Url
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//To handle popups
		driver.findElement(By.name("proceed")).click();
		Alert a= driver.switchTo().alert(); //Switch to alert
		 System.out.println(a.getText());   // To get alert text
		 
		 
		 String q= a.getText();
		 if(q.equals("Please enter a validi user name")) {
			 System.out.println("Correct data");
		 }else
			 System.out.println("Incorrect data");
		 
		 
		 a.accept();// to accept
		//a.dismiss(); // to cancel
		
		 
		 
		
		
	}

}
