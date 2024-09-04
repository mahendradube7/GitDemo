package automation_testing_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Alerts");
		driver.manage().window().maximize();

		// Simple Alert
		driver.findElement(By.xpath("//*[text()='Show Alert']")).click();
		Thread.sleep(3000); // importing alert Interface
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText()); // print alert message
		a.dismiss(); // to close the alert message

		// Confirmation Alert
		driver.findElement(By.xpath("//*[text()='Show Agreement']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a1.getText());
		// a1.accept();
		a1.dismiss();

		// Prompt Alert
		driver.findElement(By.xpath("//*[text()='Add Remarks']")).click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a2.getText());
		Thread.sleep(3000);
		a2.sendKeys("This is Alert");
		Thread.sleep(3000);
		a2.accept();
		// a2.dismiss();

		// Proceed to Agreement
		driver.findElement(By.xpath("//*[text()='Proceed to Agreement']")).click();
		Thread.sleep(2000);
		WebElement msg = driver.findElement(By.xpath("//*[text()='Do you agree with the terms and conditions?']"));
		Thread.sleep(3000);
		System.out.println(msg.getText());
		WebElement agreebtn = driver.findElement(By.xpath("//button[text()='Agree']"));
		agreebtn.click();
		Thread.sleep(3000);
		WebElement Agreemsg = driver.findElement(By.xpath("//p[text()='You have successfully shown Agreement.']"));
		String Amsg = Agreemsg.getText();
		System.out.println(Amsg);

		driver.close();

	}

}
