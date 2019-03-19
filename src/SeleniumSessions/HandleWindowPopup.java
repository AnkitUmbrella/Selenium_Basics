package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {

		/*
		Diff type of popups
		1. Alert popup-> Javascript popup- Alert popup (accept, dismiss)
		2. Browse popup-> xpath of browse button and then use send keys(address of file)
		3. Browser window popup-> get window handles method
	
		*/
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.popuptest.com/goodpopups.html"); //Enter Url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// click on link
		driver.findElement(By.className("black")).click();
		
		//Popups will appear
		Set<String> wh= driver.getWindowHandles();
		 
		//use iterator over set
		Iterator<String> it=  wh.iterator();
		String Parentwindow= it.next();
		System.out.println("Parent window is: " +Parentwindow);
		
		
		String Childwindow = it.next();
		System.out.println("Child Window is :" +Childwindow);
		
		driver.switchTo().window(Childwindow); 
		Thread.sleep(7000);// Shift to child window
		System.out.println("Child Text: " +driver.getTitle());  // Child class title
	
		
		
		driver.close(); // Close the window
		
		Thread.sleep(3000);
		driver.switchTo().window(Parentwindow);   // Move back to parent window
		
		System.out.println("Parent Text: " +driver.getTitle());   // Parent class title
		

	}

}
