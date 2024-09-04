package automation_testing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");

		driver.manage().window().maximize();

		driver.findElement(By.name("firstname")).sendKeys("XYZ"); // By Name

		driver.findElement(By.name("lastname")).sendKeys("GSIT");// By Name

		driver.findElement(By.name("reg_email__")).sendKeys("md.123890@gmail.com");// By Name   
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("md.123890@gmail.com");// By Name 

		driver.findElement(By.id("password_step_input")).sendKeys("md.123890@gmail");// By ID

		driver.findElement(By.id("day")).sendKeys("18");// By ID

		driver.findElement(By.id("month")).sendKeys("Feb");// By ID

		driver.findElement(By.id("year")).sendKeys("1999");// By ID
		
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();// By xpath ---- not covered in class yet but because of duplicate name element not able to select Male radio button so tried it by looking on youtube
		
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();// By Name
		
		System.out.println("Account is Created");
		
		
		


	}

}
