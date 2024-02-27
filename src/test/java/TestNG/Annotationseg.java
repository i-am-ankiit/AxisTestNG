package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationseg {
	@Test
	public void testcase1() {
		System.out.println("Testcase 1 is executed");
	}
	@Test
	public void testcase2() {
		System.out.println("Testcase 2 is executed");
	}
	@Test
	public void testcase3() {
		System.out.println("Testcase 3 is executed");
	}
	@Test
	public void testcase4() {
		System.out.println("Testcase 4 is executed");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("open the browser");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("close browser");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("open db connection");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("close db connection");
		
	}
}