package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		WebElement jobmenu = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		
		//importing actions class
		Actions act = new Actions (driver);
		
		//moved curser to job menu
		Thread.sleep(1500);
		act.moveToElement(jobmenu).perform();
		driver.findElement(By.xpath("//*[text()='IT jobs']")).click();
		

	}

}
