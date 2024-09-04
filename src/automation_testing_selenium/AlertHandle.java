package automation_testing_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		//importing alert Interface
		Alert a = driver.switchTo().alert();
		
		//print alert message
		System.out.println(a.getText());
		
		//to close the alert message
		a.dismiss();
		
		//driver close
		driver.close();
	

	}

}
