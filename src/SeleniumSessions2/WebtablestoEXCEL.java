package SeleniumSessions2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.utility.Xls_Reader_Naveen;

public class WebtablestoEXCEL {

	
	   static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	     driver= new FirefoxDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.w3schools.com/html/html_tables.asp");
		
    
	     //xpath for company column
	     
      //*[@id="customers"]/tbody/tr[2]/td[1]
     //*[@id="customers"]/tbody/tr[3]/td[1]
	     
	 //*[@id="customers"]/tbody/tr[7]/td[1]
	 String Before_Xpath= "//*[@id='customers']/tbody/tr[" ;
	 String After_Xpath= "]/td[1]";
	 
	//xpath for contact column
	//*[@id="customers"]/tbody/tr[2]/td[2]
	//*[@id="customers"]/tbody/tr[7]/td[2]
	 String ContactBefore_Xpath= "//*[@id='customers']/tbody/tr[" ;
	 String ContactAfter_Xpath= "]/td[2]";
	 
	 //To save data in excel sheet
	// Create Object of xls_reader class from utility to connection
     Xls_Reader_Naveen reader= new Xls_Reader_Naveen("D://temp//TestData.xlsx");
       
	   if(!reader.isSheetExist("W3SCHOOLS")){
		   reader.addSheet("W3SCHOOLS");
		   
	   }else
		   System.out.println("ERROR adding sheet");
	   reader.addColumn("W3SCHOOLS","companyname"); // Adding column names
	   reader.addColumn("W3SCHOOLS","contactname");
	 
	 
	 //To avoid hardcoded 7 value
	List<WebElement> ll= driver.findElements(By.xpath("//*[@id='customers']/tbody//tr"));
	System.out.println(ll.size());
	 
	 
	 
	     for(int i=2; i<=ll.size(); i++) {
		 
		String actual_xpath= Before_Xpath+i+After_Xpath;
		String companyname= driver.findElement(By.xpath(actual_xpath)).getText();
		System.out.println(companyname);
		 
		
		String Contactactual_xpath= ContactBefore_Xpath+i+ContactAfter_Xpath;
		String Contactname= driver.findElement(By.xpath(Contactactual_xpath)).getText();
		System.out.println(Contactname);
		 
		reader.setCellData("W3SCHOOLS", "companyname", i, companyname); //  Adding companies data to excel in companyname column.
		reader.setCellData("W3SCHOOLS", "contactname", i, Contactname);  // Adding contacts data to excel in contactname column.
		
		
	 }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
