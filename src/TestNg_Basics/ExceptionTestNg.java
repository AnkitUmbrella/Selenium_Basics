package TestNg_Basics;

import org.testng.annotations.Test;

public class ExceptionTestNg {

	// Handle exception without try catch block
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
		String x="100A";
		Integer.parseInt(x);
	}
	
}
