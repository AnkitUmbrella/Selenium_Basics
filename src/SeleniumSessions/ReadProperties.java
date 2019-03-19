package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		//  To read properties file
		// Create Object of Properties file and fileinput stream
		 
       	Properties prop= new Properties();
       	
       	FileInputStream fp= new FileInputStream("C:\\Users\\uipl-dev\\eclipse-workspace-Photon\\Naveen_Selenium\\src\\SeleniumSessions\\Config.properties");
		
       	//Load properties file
       	
       	prop.load(fp);
       	
       	
       	// Get contents of properties file using prop.getproperty method
       	System.out.println(prop.getProperty("Name"));
    	System.out.println(prop.getProperty("Age"));
    	  //getbrowser
     String browser= prop.getProperty("browser");
    	
    	
    	
    	if(browser.equals("Firefox")) {
    	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
    	}else {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
    	}
    	
		driver.get("https://reg.ebay.in/reg/PartialReg"); //Enter Url
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(prop.getProperty("Firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(By.xpath(prop.getProperty("Lastname_xpath"))).sendKeys(prop.getProperty("Lastname"));
		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}

}
