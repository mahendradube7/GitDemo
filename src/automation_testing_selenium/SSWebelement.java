package automation_testing_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SSWebelement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://olacabs.com/");
		driver.manage().window().maximize();
		
		WebElement olabikepic = driver.findElement(By.xpath("//img[@class = 'desktop-only cursor-pointer']"));
		File f = olabikepic.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\Screenshot\\olacab.png"));
		driver.close();

	}

}
