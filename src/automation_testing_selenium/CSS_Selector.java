package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
