package SeleniumSessions2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropboxes {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize(); 
	    driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/"); //Enter Url
	    
	    
	    //Pagescroll down
	WebElement element= driver.findElement(By.id("dropdownMenuButton"));
	
	//scrollIntoView(element,driver);
	Thread.sleep(3000);
	
	clickelementyJS(element, driver);
	
	
	 List<WebElement>  list= driver.findElements(By.xpath("//div[@class='dropdown-menu show' and @aria-labelledby='dropdownMenuButton']//a"));
		
	 System.out.println(list.size());
	 
	 for(int i=0; i<list.size();i++) {
		 System.out.println(list.get(i).getText());
		 if(list.get(i).getText().contentEquals("Action")) {
			 list.get(i).click();
		 }else {
			 System.out.println("Item not found");
		 }
	 }
	 

	}
	
	//To scroll into view
    public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
     	js.executeScript("window.scrollBy(0,10)");
    }

    
 // JS executor will hit js lib inside html
    public static void clickelementyJS(WebElement element, WebDriver driver) {
	   JavascriptExecutor js = ((JavascriptExecutor) driver);
      js.executeScript("arguments[0].click();", element);

  }

}
