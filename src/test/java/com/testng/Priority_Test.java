package com.testng;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test
	private void getBrowser() {
		System.out.println("get browser");
	}

	@Test(priority = 1)
	private void LaunchUrl() {
		System.out.println("launching the url");
	}

	@Test(priority = 2)
	private void signIn() {
		System.out.println("sign in");
	}

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("set property");
	}

}
