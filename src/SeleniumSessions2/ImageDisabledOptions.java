package SeleniumSessions2;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageDisabledOptions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");	
	         ChromeOptions options = new ChromeOptions();
	         disableImage(options);
	         
	         WebDriver driver= new ChromeDriver(options);
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
	         driver.get("https://www.amazon.in/");
	         System.out.println(driver.getTitle());
	
        
	
	}
	
	
	    public static void disableImage(ChromeOptions options) {
		HashMap<String, Object> img= new HashMap<String, Object>();
		img.put("images", 2);
		
		HashMap<String, Object> p= new HashMap<String, Object>();
		p.put("profile.default_content_setting_values", img);
		
		
		options.setExperimentalOption("prefs", p);
		
		
	}
	
	

}
