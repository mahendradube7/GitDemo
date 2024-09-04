package testNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation03 {

	@Test(description = " Test 1 with ID : 1234 ")
	public void test1() {
		System.out.println("Test Scenario 1");
	}

	@Test(description = " Test 2 with ID : 1235 ")
	public void test2() {
		System.out.println("Test Scenario 2");
	}

	@Test(description = " Test 3 with ID : 1236 ")
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
