package automation_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://web-locators-static-site-qa.vercel.app/image");
		driver.manage().window().maximize();
		
		WebElement img =driver.findElement(By.xpath("//img[@alt='image_screen']"));
		
		System.out.println(img.getAttribute("alt"));
		System.out.println(img.getAttribute("src"));
		
		driver.close();
	}

}
