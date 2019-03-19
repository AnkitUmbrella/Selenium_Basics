package SeleniumSessions2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchText {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		//Type into search text and select 3rd selection or by name
		
		driver.findElement(By.name("q")).sendKeys("Testing");

		// Get the results suggestions table
		List <WebElement> ll  = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::/div[1]/div[1][@class='sbll']/span[1]"));
		                       
		  System.out.println(ll.size());
		
		  
		  for(int i=0;i<ll.size();i++)
		  {
		   System.out.println("Suggestions are:"+ll.get(i).getText());
		  }
	}

}
