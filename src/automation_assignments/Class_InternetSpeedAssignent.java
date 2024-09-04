package automation_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_InternetSpeedAssignent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://fast.com/");

		driver.manage().window().maximize();

		Thread.sleep(20000);

		WebElement internetSpeed = driver.findElement(By.id("speed-value"));
		String speed = internetSpeed.getText();

		WebElement speedunits = driver.findElement(By.id("speed-units"));
		String unit = speedunits.getText();

		System.out.println("Internet Speed = " + speed + " " + unit);

		driver.close();
	}

}
