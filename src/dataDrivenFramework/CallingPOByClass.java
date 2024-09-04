package dataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPOByClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Importing Page Object Class
		
		POByClass obj =  new POByClass();
		driver.findElement(obj.uid).sendKeys("1234");
		boolean idDisplay = driver.findElement(obj.uid).isDisplayed();
		System.out.println(idDisplay);
		boolean idEnabled =driver.findElement(obj.uid).isEnabled();
		System.out.println(idEnabled);
		
		Thread.sleep(2000);
		driver.findElement(obj.pwd).sendKeys("1234");
		boolean Lbtn =driver.findElement(obj.LoginBtn).isDisplayed();
		System.out.println(Lbtn);
	}

}
