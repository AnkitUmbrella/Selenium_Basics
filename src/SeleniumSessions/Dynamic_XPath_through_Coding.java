package SeleniumSessions;

public class Dynamic_XPath_through_Coding {

	
	//input[@id='{0}']
	//input[@id='{0}' and name='{1}']
	
	public static String Createxpath(String xpathexp, Object...args) {
		for(int i=0; i<args.length; i++) {
		xpathexp= xpathexp.replace("{"+i+"}", (CharSequence) args[i]);
		
		}
		return xpathexp;
		
	}
	
	
	
	public static void main(String[] args) {
     String x1= Createxpath("//input[@id='{0}']", "test");
     System.out.println(x1);
     
     String x2= Createxpath("//input[@id='{0}' and name='{1}']", "100","kapil");
     System.out.println(x2);
	}

}
