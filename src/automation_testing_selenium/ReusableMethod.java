package automation_testing_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ReusableMethod {

	WebDriver driver;
	// creating method to launch application

	public void launchApp(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void screenshot() throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\Screenshot\\face1.png"));

	}

	// creating method to close application
	public void closeApp() {
		driver.close();
	}

	// Creating method to check element available or not
	public void elementAvailable(String loc, boolean exp) {
		boolean elementDisplay = driver.findElement(By.id(loc)).isDisplayed();
		if (elementDisplay == exp) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	// Creating method to check element clickable or not
	public void elementClickable(String loc, boolean exp) {
		boolean elementEnabled = driver.findElement(By.id(loc)).isEnabled();
		if (elementEnabled == exp) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

	public void urlContain(String loc, boolean exp) {
		String url = driver.getCurrentUrl();
		System.out.println("URL Is = " + url);
		if (url.contains(loc) == exp) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public void titleContain(String loc, boolean exp) {
		String title = driver.getTitle();
		System.out.println("Title = "+title);
		if (title.contains(loc) == exp) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
