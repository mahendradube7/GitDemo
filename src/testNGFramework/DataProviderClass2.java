package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass2 {

	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeAppp() {
		driver.close();
	}
	
	@DataProvider (name = "FB Test Data")
	public Object [][] data() {
		
	   Object [][] obj = new Object [3][2];
	   
	   obj [0][0] = "Mahi01";  obj [0][1] = "M1";
	   obj [1][0] = "Mahi02";  obj [1][1] = "M2";
	   obj [2][0] = "Mahi03";  obj [2][1] = "M3";
	   
	   return obj;
		
	}
	
	@Test (dataProvider = "FB Test Data")
	public void loginCredValidation (String uid, String pwd) throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys(uid);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	}

}
