package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test(retryAnalyzer = Retry_Class.class)
	private void demo() {

		String expected = "John";

		String actual = "Johnson";

		// Validation

		Assert.assertEquals(actual, expected);

		System.out.println("validation");

	}

//	@Test
//	private void demo1() {
//		
//		String expected="John";
//		
//		String actual="Johnson";
//		
//		SoftAssert soft=new SoftAssert();
//		
//		soft.assertEquals(actual, expected);
//		
//		System.out.println("verification");
//		
//		//soft.assertAll();
//
//	}

}
