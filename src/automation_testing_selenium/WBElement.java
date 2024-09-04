package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WBElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email")); // By ID

		WebElement pass = driver.findElement(By.id("pass"));// By ID

		WebElement login = driver.findElement(By.name("login"));

		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());
		System.out.println(pass.isDisplayed());
		System.out.println(pass.isEnabled());
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());

		email.sendKeys("Email");
		pass.sendKeys("Pass");

		email.clear();
		pass.clear();

		login.click();
		driver.close();
	}

}
