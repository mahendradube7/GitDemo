package automation_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args) {

		// Launch the chrome browser.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open URL: https://web-locators-static-site-qa.vercel.app/Dropdown
		driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");
		driver.manage().window().maximize();

		// Locate the dropdown “Which country do you want to travel”
		WebElement drop = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/select"));

		// Select “Australia” using selectByVisibleText() method
		Select dp1 = new Select(drop);
		dp1.selectByVisibleText("Australia");

		// Check if this dropdown allows multiple selection
		boolean ms = dp1.isMultiple();
		System.out.println(ms);

		// Locate and move to the “MULTI SELECT DROPDOWN” tab
		WebElement multiselectdrop = driver.findElement(By.xpath("//*[text()='Multi Select Dropdown']"));
		multiselectdrop.click();

		// Locate the dropdown “Skills”
		WebElement skilldrop = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/select"));

		// Check if this dropdown allows multiple selection
		Select dp2 = new Select(skilldrop);
		boolean ms1 = dp2.isMultiple();
		System.out.println(ms1);

		// Few of the options are selected by default. Retrieve and print these
		List<WebElement> selectedoptions = dp2.getAllSelectedOptions();
		for (WebElement data : selectedoptions) {
			System.out.println(data.getText());
		}

		// Close the browser
		driver.close();
	}

}
