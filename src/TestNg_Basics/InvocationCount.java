package TestNg_Basics;

import org.testng.annotations.Test;

public class InvocationCount {

	
	// Run the testcases 10 times
	
	@Test(invocationCount=10)
	public void count() {
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
		
	}
	
	
	
	
	
}
