package automation_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment {

	public static void main(String[] args) {

		// Launch the chrome browser.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open URL:  https://crio-qkart-frontend-qa.vercel.app/
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		driver.manage().window().maximize();

		//Print the label(text) of “LOGIN” button
		WebElement loginbbtn = driver.findElement(By.xpath("//button[text()='Login']"));
		System.out.println(loginbbtn.getText());
		
		//Click on “LOGIN” button
		loginbbtn.click();
		
		//Enter text in , Username textbox - “admin123” , Password textbox - “admin123”
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		username.sendKeys("admin123");
		password.sendKeys("admin123");
		
		//Click on “LOGIN TO QKART” button
		WebElement qkartlogin = driver.findElement(By.xpath("//button[text()='Login to QKart']"));
		qkartlogin.click();
		
		//Close the Application
		driver.close();
	}

}
