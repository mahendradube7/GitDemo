package automation_testing_selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Get Page Title
		String pageTitle = driver.getTitle();
		System.out.println("Title Of Page is= " + pageTitle);

		// Get Page URL
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is = " + pageURL);

		// Verify URL Contains
		if (pageURL.contains(".com")) {
			System.out.println("URL is Pass");
		}

		else {
			System.out.println("URL is Fail");
		}

		// Verify URL startWith
		if (pageURL.startsWith("www")) {
			System.out.println("URL is Pass");
		}

		else {
			System.out.println("URL is Fail");
		}

		// display method
		boolean emailDisplay = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(emailDisplay);

		boolean loginBtnDisplay = driver.findElement(By.name("login")).isDisplayed();
		System.out.println(loginBtnDisplay);

		// Enabled method
		boolean emailEnabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(emailEnabled);

		boolean loginBtnEnabled = driver.findElement(By.name("login")).isEnabled();
		System.out.println(loginBtnEnabled);

		if (loginBtnDisplay == true && loginBtnEnabled == true) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}

		// get Attribute
		String attr = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(attr);

		// get Tag Name
		String loginBtnTname = driver.findElement(By.name("login")).getTagName();
		System.out.println(loginBtnTname);

		// get Size
		String emailBoxTname = driver.findElement(By.id("email")).getTagName();
		System.out.println(emailBoxTname);

		org.openqa.selenium.Dimension loginBtnTSize = driver.findElement(By.name("login")).getSize();
		System.out.println(loginBtnTSize);

		// get Text
		String loginBtnText = driver.findElement(By.name("login")).getText();
		System.out.println(loginBtnText);

		driver.close();
	}

}
