package Ngwebdriver_Protractor;

import java.util.concurrent.TimeUnit;

import org.bridj.objc.SEL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class NgWebdriver_Test {

	
	@Test
	public void Login() {
		
		
		// To handle binding and models ng elements.
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get("http://juliemr.github.io/protractor-demo/");
		
		  
	     NgWebDriver ng = new NgWebDriver((JavascriptExecutor) driver);
	     ng.waitForAngularRequestsToFinish();
	     driver.findElement(ByAngular.model("first")).sendKeys("2");
	     WebElement d=driver.findElement(ByAngular.model("operator"));
	     d.click();
	     
	      Select s= new Select(d);
	        s.selectByValue("DIVISION");
	     
	       
	     driver.findElement(ByAngular.model("second")).sendKeys("5");
	     driver.findElement(By.id("gobutton")).click();
		
		

	}

}
