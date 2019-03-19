package SeleniumSessions2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropboxHandle {

	public static void main(String[] args) {
		
		// Handle Bootstrap dropdowns
		//info-> https://getbootstrap.com/docs/4.0/components/dropdowns/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize(); 
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); //Enter Url
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//or we can use //button[contains(@class, 'multiselect')]
		
		
		//List all elements
		List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//li//a//label"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contentEquals("Jaaasva")){
				list.get(i).click();
				
			}
			else
				list.get(i).click();
	}
		
				

	}

}
