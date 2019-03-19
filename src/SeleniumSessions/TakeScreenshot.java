package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/"); //Enter Url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Takes Screenshot and add commonIO Jars
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("D:\\temp\\screenshot.png"));
	}	
	
	
	
	
		//OR with date timestamp
		
		public static void Takesscreenshot(WebDriver driver) throws IOException, InterruptedException {
	        File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File dest= new File("D:\\temp\\screenshot_"+timestamp()+".png");
	        FileUtils.copyFile(scr, dest);
	        Thread.sleep(2000);
	    }

	    public static String timestamp() {
	        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	    }
		

	}
	
	


