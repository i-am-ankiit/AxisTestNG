package TestNG;

import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test(enabled = false)
	public void testcase1() {
		System.out.println("Testcase1 executed succcessfully");
	}
	
	@Test(dependsOnMethods = "testcase1")
	public void testcase2() {
		System.out.println("Testcase2 executed succcessfully");
	}
	
	@Test(priority = 0)
	public void testcase3() {
		System.out.println("Testcase3 executed succcessfully");
}
}
