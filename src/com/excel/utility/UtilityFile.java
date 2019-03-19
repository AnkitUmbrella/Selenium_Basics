package com.excel.utility;

import java.util.ArrayList;

public class UtilityFile {

	static Xls_Reader_Naveen reader;
	
	public static ArrayList<Object[]> getdatafromExcel() {
		 
		
		ArrayList<Object[]> mydata= new ArrayList<Object[]>(); //Created an arraylist object to fetch and store values from excel file.
		try {
			reader = new Xls_Reader_Naveen("D:\\temp\\TestData.xlsx"); //Try/Catach block so if tomorrow sheet is unavialble.
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
		   
		       int rowcount= reader.getRowCount("DataTestNg"); //getrowcount of this sheet
		       
		       for(int i=2 ; i<=rowcount; i++) {
		    	String Firstname=  reader.getCellData("DataTestNg", "Firstname", i);
		    	String Lastname=  reader.getCellData("DataTestNg", "Lastname", i);
		    	String Email  =    reader.getCellData("DataTestNg", "Email", i);
		       String Password  =   reader.getCellData("DataTestNg", "Password", i);
		     
		     
		     //Add these above in object array
		       Object[] obj = {Firstname,Lastname, Email, Password };
		     
		     //now add in mydata
		       mydata.add(obj);
		     
		     
		       }
		    
		
		return mydata;

	}

}
