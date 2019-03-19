package TestNg_Basics;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Basics {

	// No main method in testNG. We have annotations (@Before(S,T,C,M), @Test, @After(S,C,M,T))
	//All annotations are associated with method
	
	
/* [RemoteTestNG] detected TestNG version 6.14.3
Set up Chrome driver         @BeforeSuite
Set up browser               @BeforeTest
Do Login                     @BeforeClass
Enter Url                    @BeforeMethod
Reached to Dashboard         @TEST
Close the window             @AfterMethod
Delete Cookies               @AfterClass
Logout from app              @AfterTest
PASSED: Dashboard
	 */
	
	@BeforeSuite //1
	public void setup() {
		System.out.println("@BeforeSuite-> Set up Chrome driver");
	}
	
	
	@BeforeTest //2
	public void Browser() {
		System.out.println("@BeforeTest-> Set up browser");
	}
	
	
	@BeforeClass //3
	public void dologin() {
		System.out.println("@BeforeClas-> Do Login");
	}
	
	
	@BeforeMethod //4
	public void enterurl() {
		System.out.println("@BeforeMethod-> Enter Url");
	}
	
	
	
	@Test
	public void Dashboard() {
		System.out.println("@Test1-> Reached to Dashboard");
	}
	
	//2 pair of tc will be created alphabetically and executed once in pair with @before and @after method
	/* @BeforeMethod
	 * @Test   tc-1
	 * @AfterMethod 
	/* @BeforeMethod
	 * @Test   tc-2
	 * @AfterMethod
	 * 
	 */
	
	@Test
	public void Searchtext() {
		System.out.println("@Test2->Search for text");
		throw new SkipException("skipped search text");
	}
	
	
	
	@AfterMethod //5
	public void closewindow() {
		System.out.println("@AfterMethod-> Close the window");
	}
	
	
	@AfterClass //6
	public void deletecookies() {
		System.out.println("@AfterClass-> Delete Cookies");
	}
	
	@AfterTest //7
	public void logout() {
		System.out.println("@AfterTest-> Logout from app");
	}
	
	
	
	@AfterSuite
	public void terminate() {
		System.out.println("@AfterSuite-> Terminate Session");
	}
	
	/*
	[RemoteTestNG] detected TestNG version 6.14.3
	@BeforeSuite-> Set up Chrome driver
	@BeforeTest-> Set up browser
	@BeforeClas-> Do Login
	@BeforeMethod-> Enter Url
	@Test1-> Reached to Dashboard
	@AfterMethod-> Close the window
	
	@BeforeMethod-> Enter Url
	@Test2->Search for text
	@AfterMethod-> Close the window
	@AfterClass-> Delete Cookies
	@AfterTest-> Logout from app
	PASSED: Dashboard
	PASSED: Searchtext
	
	*/
}
