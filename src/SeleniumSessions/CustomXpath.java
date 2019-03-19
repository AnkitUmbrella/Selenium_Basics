package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		//customxpath
		//driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("JAVA");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("face");
		//login button
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		//contains and starts-with function (There is no == in contains  Remember the syntax)
		//driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("Shoes");
		
		//Absolute xpath-> Not recommended to use
		//1. Performance Issues
		//2. Not reliable
		//3. Can be changed anytime in future
		
		
          //dynamic ids
		  /* id= "test_123";
		    id="test_345"
		    id="123_test"
		    id="453_test"
		*/
		
		//contains and starts-with, Ends with
		//driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("qwerty");
		//driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("hahhah");
		//driver.findElement(By.xpath("//input[ends-with(@id, '_test')]")).sendKeys("hahhah");
		
      //Custom xpath for links-> all links have <a>tag
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[contains(text(), 'Advanced')]")).click();
		
		
		//Findelements
		//1. To extract all links
		//2. Get text of all links
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size()); // Size of all links
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText()); //Print all links
		}
		
	}

}
