package testNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation02 {

	@Test(priority = 3)
	public void test1() {
		System.out.println("Test Scenario 1");
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("Test Scenario 2");
	}

	@Test(invocationCount=4,priority = 2)
	public void test3() {
		System.out.println("Test Scenario 3");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
