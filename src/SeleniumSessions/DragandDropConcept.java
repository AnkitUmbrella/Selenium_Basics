package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Also called Dynamic Wait
		// If element is visible within 2 sec then rest of sec will be ignored.
		
		// Thread.sleep(2000) // wait for 2 sec we should avoid thread.sleep
		driver.get("https://jqueryui.com/droppable/");
		
		//Go to frame
		driver.switchTo().frame(0);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		//also
		//act.dragAndDropBy(source, 100, 100).build().perform();
		act.dragAndDrop(source, target).build().perform();
		
		

	}

}
