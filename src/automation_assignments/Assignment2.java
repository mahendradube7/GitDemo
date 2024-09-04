package automation_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// TC01 = Title length should be greater than URL link
		String pageTitle = driver.getTitle();
		System.out.println("Title Of Page is= " + pageTitle);
		int titleLength = pageTitle.length();
		System.out.println("Length of Title " + titleLength);

		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is = " + pageURL);
		int URLLength = pageURL.length();
		System.out.println("Length of URL " + URLLength);

		if (titleLength > URLLength) {
			System.out.println("Test Case 1 is Pass");
		} else {
			System.out.println("Test Case 1 is Fail");
		}

		System.out.println("*********************************************************");

		// TC02 = Click on Login Button, Login button should be Available & should be
		// Enabled

		driver.findElement(By.name("login")).click();
		boolean loginBtnDisplay = driver.findElement(By.name("login")).isDisplayed(); // display method
		System.out.println(loginBtnDisplay);

		boolean loginBtnEnabled = driver.findElement(By.name("login")).isEnabled(); // Enabled method
		System.out.println(loginBtnEnabled);

		if (loginBtnDisplay == true && loginBtnEnabled == true) {
			System.out.println("Test Case 2 is Pass");
		} else {
			System.out.println("Test Case 2 is Fail");
		}

		System.out.println("*********************************************************");

		// TC03 = click on forgot link , Title of forgot link should not contain
		// "password1"

		driver.findElement(By.linkText("Forgotten password?")).click();
		String forgtLinkTitle = driver.getTitle();
		System.out.println(forgtLinkTitle);

		if (forgtLinkTitle.contains("password1")) {
			System.out.println("Test Case 3 is Fail");
		} else {
			System.out.println("Test Case 3 is Pass");
		}

		System.out.println("*********************************************************");

		// TC04 = Search Button should be available it should be Enabled

		boolean searchBtnDisplay = driver.findElement(By.id("did_submit")).isDisplayed();
		System.out.println(searchBtnDisplay);

		boolean searchBtnEnabled = driver.findElement(By.id("did_submit")).isEnabled();
		System.out.println(searchBtnEnabled);

		if (searchBtnDisplay == true && searchBtnEnabled == true) {
			System.out.println("Test Case 4 is Pass");
		} else {
			System.out.println("Test Case 4 is Fail");
		}
		
		driver.close();

	}

}
