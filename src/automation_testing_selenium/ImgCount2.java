package automation_testing_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgCount2 {

	public static void main(String[] args) {
		
		//
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images are = " + imgs.size());

		driver.close();
	}
	
	

}
