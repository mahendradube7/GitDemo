package testNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@DataProvider (name = "TestData")
	public Object [][] dpMethod (){
		return new Object [][] {{"data-one"}, {"data-two"}, {"data-three"}};
	}
	
	@Test (dataProvider = "TestData")
	public void testMethod (String data) {
		
		System.out.println(data);
	}
			

}
