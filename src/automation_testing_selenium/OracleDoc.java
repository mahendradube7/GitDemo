package automation_testing_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleDoc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();

		WebElement f1 = driver.findElement(By.name("packageListFrame"));
		//driver.findElement(By.xpath("//a[@href='java/applet/package-frame.html']"));

		List<WebElement> links = driver.switchTo().frame(f1).findElements(By.tagName("a"));

		System.out.println(links.size());
		for (WebElement data : links) {
			System.out.println(data.getText());
		}

		System.out.println("*******************************************************");
		for (WebElement data1 : links) {
			String l1 = data1.getText();
			if (l1.contains("sql")) {
				System.out.println(l1);
			}
		}
		driver.close();
	}

}
