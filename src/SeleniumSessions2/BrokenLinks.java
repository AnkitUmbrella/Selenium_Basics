package SeleniumSessions2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String linkurl="https://www.google.com";
		driver.get(linkurl); //Enter Url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> links= driver.findElements(By.tagName("a")); // to get the links size
		 System.out.println(links.size());
		 
		 for(int i=0; i<links.size();i++) {
			  WebElement ele= links.get(i);
			  String attributes= ele.getAttribute("href"); // to get attributes
			  
		 	 
		 verifylink(attributes);
		 
		 }
	}
	
		 
		 public static void verifylink(String linkurl) throws IOException{
			 
			 URL url= new URL(linkurl);  //Create Object of URL and Java.net lib import 
			 
			 HttpURLConnection urlconnection= (HttpURLConnection) url.openConnection();//Method openconnection in URL
			 
			 urlconnection.setConnectTimeout(3000);
			 
			 urlconnection.connect();
			 
			 if(urlconnection.getResponseCode()==200) {
				 System.out.println(linkurl + " "+urlconnection.getResponseCode());
			 }else
				 System.out.println(linkurl + " "+urlconnection.getResponseCode());
			 
			 
			 
			 
			 
		 }

	

}
