package automation_testing_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Explicit wait
		Thread.sleep(4000);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("qwer");
		driver.findElement(By.id("pass")).sendKeys("qwer");
		
		//WebDriver wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 50));
		w.until(ExpectedConditions.titleContains("Facebook"));
		w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 47));
		driver.close();
	}

}
