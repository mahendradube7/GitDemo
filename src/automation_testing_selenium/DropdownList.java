package automation_testing_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		//driver.manage().window().maximize();

		WebElement day = driver.findElement(By.id("day"));// By ID

		WebElement month = driver.findElement(By.id("month"));// By ID

		WebElement year = driver.findElement(By.id("year"));// By ID
		
		Select drop = new Select (day);
		drop.selectByValue("3");
		
		Select drop1 = new Select (month);
		drop1.selectByIndex(5);
		
		Select drop2 = new Select (year);
		drop2.selectByVisibleText("1999");
		
		boolean md = drop2.isMultiple();
		System.out.println(md);
		
		List <WebElement> ml = drop1.getOptions();
		System.out.println(ml.size());
		for (WebElement data:ml) {
			System.out.println(data.getText());
		}
		
		driver.close();

	}

}
