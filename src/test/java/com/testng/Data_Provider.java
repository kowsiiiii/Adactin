package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "data")
	private void creadentials(String username, String password) {
		
		System.out.println("Username " +username);
		
		System.out.println("Password " +password);

	}
	

	@DataProvider
	private Object[][] data() {
		
		return new Object [][] {
			
			
			{"James" , "James@123"},
			
			{"Bhuvanesh", "Bhuvanes@123"},
			
			{"Vignesh" , "Vignesh@123"}
			
			
		};
		
		

	}

}



