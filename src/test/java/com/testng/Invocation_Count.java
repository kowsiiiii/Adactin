package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("Set property");
	}

	@Test
	private void browserLaunch() {
		System.out.println("Broswer launch");
	}
	
	@Test(invocationCount = 3, priority = 1)
	private void refresh() {
		
		System.out.println("Refresh");

	}

}
