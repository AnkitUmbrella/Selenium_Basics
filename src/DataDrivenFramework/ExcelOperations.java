package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.utility.Xls_Reader_Naveen;

public class ExcelOperations {

	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uipl-dev\\Desktop\\Selenium@feb2019\\geckodriver.exe");
	     WebDriver driver= new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	     
	     //Read Data
	     // Create Object of xls_reader class from utility to connection.
	     Xls_Reader_Naveen reader= new Xls_Reader_Naveen("D://temp//TestData.xlsx");
	     
	     
	     if(!reader.isSheetExist("Homepage")) {
	    	 reader.addSheet("Homepage");
	     }else
	    	 System.out.println("Sheet not exists");
	     
	    // reader.addHyperLink(sheetName, screenShotColName, testCaseName, index, url, message)
	     
	   int cellno=  reader.getCellRowNum("DataTestNg", "Lastname", "ktest");
		System.out.println(cellno);
		
		
		
		
		
	}

}
