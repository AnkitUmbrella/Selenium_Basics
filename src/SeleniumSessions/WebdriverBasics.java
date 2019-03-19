package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	
	
	//Launch Browser
	// 1. For FirefoxBrowser-> Geckodriver-> class in selenium, Create an object of geckodriver.
	// Firefoxdriver is a class implementing Webdriver Interface (Available in selenium)
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
//		driver.get("http://www.google.com"); //Enter Url
		
		
		//2. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize(); //max window
		d.get("http://www.google.com");
		String t= d.getTitle(); // Get title and returning a string.
		System.out.println(t); // print title
	
		
		
		//Validating title
		if(t.equals("Flipkart")) {
			System.out.println("Correct title");
		}else
			System.out.println("Incorrect title"); 
			
		
		System.out.println(d.getCurrentUrl()); // To view current url
	//	System.out.println(d.getPageSource()); // To view page source
		
		 d.quit(); // Quit the browser

	}

}
