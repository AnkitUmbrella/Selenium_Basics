package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableConcept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html"); //Enter Url
		
		
		// /html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]
		// /html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]
		// /html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]
		// /html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[2]
		
		
		
		//1. Method -1
		String before_xpath= "/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[";
		String after_xpath= "]/td[2]";
		
		for(int i=1; i<=10 ; i++) {
			String names= driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(names);
			
			// /html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]
			if(names.equals("Cedric Kelly")) {
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[" +i+ "]/td[1]")).click();
				
			}
			
		
		
		
		
		
		//2. Method- 2-> Preceding
		//class[contains(text(),'sorting_1)/parent::td/preceding-sibling:td//class[contains(text(),'select-checkbox')]
		
		//driver.findElement(By.xpath("//class[contains(text(),'sorting_1')/parent::td/preceding-sibling:td//class[contains(text(),'select-checkbox')]")).click();
		
		}
		
		

	}
}


