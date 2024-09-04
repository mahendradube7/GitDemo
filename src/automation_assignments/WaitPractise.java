package automation_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/");
		driver.manage().window().maximize();
		
		//Explicit wait
		Thread.sleep(3000);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Kopargaon");
		WebElement to = driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		to.sendKeys("Pune");
		to.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
		//driver.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		//Web driver wait
		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 231));
		w.until(ExpectedConditions.titleContains("IRCTC"));
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
