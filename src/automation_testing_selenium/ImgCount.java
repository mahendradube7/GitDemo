package automation_testing_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		//driver.navigate().to("https://www.bankofamerica.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		/*
		 * for (int i = 0; i < links.size(); i++) {
		 * System.out.println(links.get(i).getText()); }
		 */
		for (WebElement data : links) {

			if (data.getText().startsWith("M") == true) {
				System.out.println("Name Of link = " + data.getText());
			}

		}

		List<WebElement> imgs = driver.findElements(By.tagName("img"));

		Thread.sleep(2000);
		System.out.println("Total Number of Images Are = " + imgs.size());

		Thread.sleep(2000);
		System.out.println("Total Number of Links Are = " + links.size());

		if (links.size() > imgs.size()) {
			System.out.println("Number of Links are Greater");
		} else {
			System.out.println("Number of Images are Greater");
		}

		driver.close();

	}

}
