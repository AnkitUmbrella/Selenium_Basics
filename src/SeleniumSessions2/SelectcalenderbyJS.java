package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectcalenderbyJS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        
        WebElement element= driver.findElement(By.id("datepicker"));
        String dateval="04/23/2019";
        SetcalenderbyJS(driver, element, dateval);
        driver.switchTo().defaultContent();
	}
	
	
	
	public static void SetcalenderbyJS(WebDriver driver, WebElement element, String dateval) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+dateval+"');", element);
		
		
	}


}
