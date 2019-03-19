package SeleniumSessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibility {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
  		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dgw_sgn_ib%2F259-0389738-1984058&prevRID=QAKXE1Y1EZ1EPKM7WD0X&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&marketPlaceId=A21TJRUUN4KGV&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		
		//1. isdisplayed() method is applicable for all the elements and returns boolean value
		
		boolean id=  driver.findElement(By.xpath("//input[@id='continue']")).isDisplayed(); // for continue button
		System.out.println(id); // true
		
		
		//2. isenabled() method (if button or element enabled or not enabled)
		
		boolean b2=  driver.findElement(By.xpath("//input[@id='continue']")).isEnabled(); // for continue button
		System.out.println(b2); // true
		
		
		
		//3.isselected()-> for checkboxes, radiobutton and dropdown
		    driver.navigate().to("https://www.zoho.in/crm/lp/free-crm-software.html?network=g&device=c&keyword=free%20crm&campaignid=197311532&creative=274328882521&matchtype=e&adposition=1t1&placement=&adgroup=10546319732&gclid=EAIaIQobChMIm-DOuZPK4AIVhZSPCh11HAWMEAAYASAAEgJElvD_BwE");

		   boolean b4= driver.findElement(By.id("tos")).isSelected(); // the checkbox
		     System.out.println(b4); //false
		     
		     
		     Thread.sleep(5000);
		     //click checkbox
		     driver.findElement(By.name("tos")).click();
		     Thread.sleep(5000);
		     boolean b5= driver.findElement(By.id("tos")).isSelected(); // the checkbox
		     System.out.println(b5); //True
		    
		    
		    
	}

}
