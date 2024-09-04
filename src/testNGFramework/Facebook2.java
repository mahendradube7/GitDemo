package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook2 {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterTest
	public void closeAppp() {
		driver.close();
	}

	@Test
	public void ts1() {
		boolean loginBtnDisplay = driver.findElement(By.name("login")).isDisplayed(); // display method
		System.out.println(loginBtnDisplay);

		boolean loginBtnEnabled = driver.findElement(By.name("login")).isEnabled(); // Enabled method
		System.out.println(loginBtnEnabled);

		if (loginBtnDisplay == true && loginBtnEnabled == true) {
			System.out.println("Test Case 1 is Pass");
		} else {
			System.out.println("Test Case 1 is Fail");
		}
	}

	@Test
	public void ts2() {
		String email = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(email);

		String pwd = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println(pwd);
	}
	
	@Test
	public void ts3() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		String forgtLinkTitle = driver.getTitle();
		System.out.println(forgtLinkTitle);

		if (forgtLinkTitle.contains("password1")) {
			System.out.println("Test Case 3 is Fail");
		} else {
			System.out.println("Test Case 3 is Pass");
		}
	}
}
