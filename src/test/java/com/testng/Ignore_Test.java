package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class Ignore_Test {

	@Ignore
	@Test
	private void women() {
		System.out.println("Women");
	}

	@Test(enabled = false)
	private void men() {
		System.out.println("Men");
	}

	@Test
	private void Dressess() {
		System.out.println("Dressess");
	}

	@Test
	private void tShirt() {
		System.out.println("tShirt");
	}

}
