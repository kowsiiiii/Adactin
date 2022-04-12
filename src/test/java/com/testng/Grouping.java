package com.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "music")
	private void spotify() {
		System.out.println("spotify");
	}

	@Test(groups = "music")
	private void wynk() {
		System.out.println("wynk");
	}

	@Test(groups = "activity")
	private void sports() {
		System.out.println("sports");
	}

	@Test(groups = "shopping")
	private void dressess() {
		System.out.println("dressess");
	}

	@Test(groups = "shopping")
	private void tshirt() {
		System.out.println("T-shirt");
	}

}
