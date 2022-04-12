package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setProperty() {
		System.out.println("Set property");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("launching the browser");

	}

	@BeforeClass
	private void launchUrl() {
		System.out.println("launching the url");
	}

	@BeforeMethod
	private void signin() {
		System.out.println("Sign in");
	}

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}

	@Test
	private void dressess() {
		System.out.println("Dressess");
	}

	@AfterMethod
	private void signoff() {
		System.out.println("sign off");
	}

	@AfterClass
	private void homePage() {
		System.out.println("Home Page");

	}

	@AfterTest
	private void close() {
		System.out.println("close");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("delete cookies");
	}

}
