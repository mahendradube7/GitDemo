package dataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CallingPageObject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		PageObject p = PageFactory.initElements(driver, PageObject.class);
		
		System.out.println(p.email.isDisplayed());
		System.out.println(p.Password.isEnabled());
		
		Thread.sleep(2000);
		p.email.sendKeys("2323");
		Thread.sleep(2000);
		p.Password.sendKeys("2442");
		
		System.out.println(p.loginBtn.isDisplayed());
		System.out.println(p.loginBtn.isEnabled());
		
		System.out.println(p.ForgotPwd.isEnabled());
		
		driver.close();
	}

}
