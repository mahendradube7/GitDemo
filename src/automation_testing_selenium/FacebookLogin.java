package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("9834019301"); // By ID

		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("9834019301@MAH");// By ID

		// clear method
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys("9834019301");

		//Click Method
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

		Thread.sleep(2000);
		//driver.close();

	}

}
