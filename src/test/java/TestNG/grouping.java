package TestNG;

import org.testng.annotations.Test;

public class grouping {
	@Test(groups = {"Sanity","Regression"})
	public void login() {
		System.out.println("user is logged in");
	}
	
	@Test(groups = {"Regression"})
	public void AddtoCart() {
		System.out.println("product added to cart");
	}
	@Test(groups = {"Sanity"})
	public void product() {
		System.out.println("payment is done");
	}
	
	@Test(groups = {"Regression"})
	public void payment() {
		System.out.println("payment is done");
	}

}
