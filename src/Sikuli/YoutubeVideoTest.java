package Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class YoutubeVideoTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		//+Sikuli is an image-based open source tool to automate the GUI and can be used on any platform like Windows/Linux/Mac/Mobile. 

         // +Sikuli uses a technique called image recognition to identify and control GUI components.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.get("https://www.youtube.com/watch?v=v9CXEYLpDsk");
		
		//Sikuli-> Create object of screen class
	
	
		Screen s= new Screen();
		
		//Go to settings
		Pattern Settings= new Pattern("C:\\Users\\uipl-dev\\eclipse-workspace-Photon\\Naveen_Selenium\\src\\Sikuli\\Y_Settings.png");
		//s.wait(Settings, 2000);
		s.click();
		//s.click();
		
		
		//View quality
				Pattern quality= new Pattern("C:\\Users\\uipl-dev\\eclipse-workspace-Photon\\Naveen_Selenium\\src\\Sikuli\\Y_Quality.png");
				//s.wait(quality, 2000);
				s.click();
				//s.click();
		
				
		//Choose 480p
				Pattern chooseQ= new Pattern("C:\\Users\\uipl-dev\\eclipse-workspace-Photon\\Naveen_Selenium\\src\\Sikuli\\Y_480p.png");
				//s.wait(chooseQ, 2000);
				s.click();
				//s.click();
				
				
				
//				Pattern pauseimg= new Pattern("C:\\Users\\uipl-dev\\eclipse-workspace-Photon\\Naveen_Selenium\\src\\Sikuli\\Y_pause.png");
//				//s.wait(pauseimg, 2000);
//				s.click();
//				s.click();
//			
	System.out.println("done");			

	}

}
