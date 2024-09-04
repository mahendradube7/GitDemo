package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("1233");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1233");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//*[text()='Forgotten password?']")).click();

	}

}
