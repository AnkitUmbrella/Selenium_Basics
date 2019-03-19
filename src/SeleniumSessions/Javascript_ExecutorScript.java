 package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript_ExecutorScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		/* Do something amazing and cool stuff with JavaScriptExecutor With Selenium WebDriver:
1. Highlight an Element
2. DrawBorder around an Element
3. Generate custom Alert during Test Execution
4. Click on an Element by using JavaScript
5. Refresh browser by using JavaScript
6. Get Title by using JavaScript
7. Get InnerText of page by using JavaScript
8. Scroll Into View and Scroll Page Down
*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
  		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://ui.cogmento.com/");
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("12345");
		driver.get("https://www.amazon.in/");
		
		//login button
		//WebElement ele= driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button')]");
		Thread.sleep(3000);
		
		// Highlight the border
		// highLighterMethod(driver, ele); 
		 
		// Click a button using JS
		// clickelementyJS(ele, driver);   
		 
		 
		/* Take Screenshot
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\uipl-dev\\eclipse-workspace-Photon\\Naveen_Selenium\\src\\SeleniumSessions\\Screenshots\\screenshot.png"));
          */		
		 
		  
			
		//call Generate alert using javascript
		//generateAlert(driver, "This is a new alert error msg pls respond");
		 
			
		// 1. Refresh using selenium-> Navigate
		 //driver.navigate().refresh();	
		
		// 2. Refresh Using JS
		  //RefreshPage(driver);
		
		 
		//Get title of page by JS
		  System.out.println(getTitleByJS(driver));
		  
		
		//Get page inner text using JS
		  //System.out.println(getPageInnerText(driver));
		
		//Scroll page down using JS
		  //scrollPageDown(driver);
		
		
		//Scroll into view until the element available by JS
		  WebElement discount= driver.findElement(By.xpath("//span[contains(text(),'Up to 40% off: Extension cords')]"));
			scrollIntoView(discount, driver);
		
			
	}
	
      //Creating a custom function for highlighting border and background using JS
     public static void highLighterMethod(WebDriver driver, WebElement element){
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid black')", element);
   // js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
	}
    
 
    // To generate custom alert during runtime-> JSFunction should be alert not Alert
     public static void generateAlert(WebDriver driver, String message){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("alert('"+message+"')"); //org.openqa.selenium.JavascriptException: ReferenceError: Alert is not defined

    }
 
      // To click on any element using JS
    // JS executor will hit js lib inside html
     public static void clickelementyJS(WebElement element, WebDriver driver) {
	   JavascriptExecutor js = ((JavascriptExecutor) driver);
       js.executeScript("arguments[0].click();", element);
 
   }
 
     // To Refresh the page using JS
     public static void RefreshPage(WebDriver driver) {
	   JavascriptExecutor js = ((JavascriptExecutor) driver);
       js.executeScript("history.go()");
 
   }
 
    // To get page title by JS
     public static String getTitleByJS(WebDriver driver){
     	JavascriptExecutor js = ((JavascriptExecutor) driver);
     	String title = js.executeScript("return document.title;").toString();
     	return title;
     
     }
 
     
     // To get inner page text
     public static String getPageInnerText(WebDriver driver){
     	JavascriptExecutor js = ((JavascriptExecutor) driver);
     	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
     	return pageText;
     }
     
     
     //To full scrolldown at the bottom of page
     public static void scrollPageDown(WebDriver driver){
     	JavascriptExecutor js = ((JavascriptExecutor) driver);
     	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     }
     
     
     //To scroll into view
     public static void scrollIntoView(WebElement element, WebDriver driver){
     	JavascriptExecutor js = ((JavascriptExecutor) driver);
     	js.executeScript("arguments[0].scrollIntoView(true);", element);
      	js.executeScript("window.scrollBy(0,-100)");
     }

}
