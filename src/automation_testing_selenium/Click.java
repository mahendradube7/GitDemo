package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		//importing actions class
		Actions act = new Actions (driver);
		
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dc).perform();
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rc).perform();
		WebElement lc = driver.findElement(By.xpath("//button[text()='Click Me']"));
		//act.contextClick(lc).perform();
		
		
		
		
		//driver.close();
	}

}
