package TestNg_Basics;

import org.testng.annotations.Test;

public class TestNgFeatures {

	
	@Test
	public void login() {
		int i=9/0;
		System.out.println("Do login");
	}
	

	
	@Test (dependsOnMethods="login")
	public void search() {
		System.out.println("Do search");
	}
	
	
//	@Test
//	public void logout() {
//		System.out.println("logout success");
//	}
	
}
