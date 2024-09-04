package automation_testing_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		
		
		
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Meta Store']")).click();
		Thread.sleep(3000);
		
		Set<String> winID = driver.getWindowHandles();
		System.out.println(winID.size());
		
		for (String data : winID) {
			driver.switchTo().window(data);
			System.out.println(driver.getTitle() + " = " + data);
			Thread.sleep(3000);
			if (driver.getTitle().contains("Met")==false) {
				driver.close();
			}
		}
		
		//driver.close();
		//driver.quit();
	}

}
