package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InternetSpeed {

	WebDriver driver;
	
	@BeforeMethod
	public void launchApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://fast.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeAppp() {
		driver.close();
	}
	
	@Test
	public void Speed () {
		WebElement internetSpeed = driver.findElement(By.id("speed-value"));
		String speed = internetSpeed.getText();

		WebElement speedunits = driver.findElement(By.id("speed-units"));
		String unit = speedunits.getText();

		System.out.println("Internet Speed = " + speed + " " + unit);

		System.out.println("App Title : " + driver.getTitle());
	}
}
