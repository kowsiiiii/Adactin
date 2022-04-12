package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void Demo() {
		
		int a=10;
		
		System.out.println(a/0);

	}

}
