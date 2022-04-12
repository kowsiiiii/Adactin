package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({ "username", "password" })
	private void creadentials(@Optional("Bhuvanesh") String username, String password) {

		// inputValueElement(pom.getInstanceLp().getUsername(), username);

		System.out.println("Username " + username);

		System.out.println("Password " + password);

	}

}
