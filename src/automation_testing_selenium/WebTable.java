package automation_testing_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		
		WebElement webtable = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List <WebElement> bankname = webtable.findElements(By.tagName("a"));
		for (WebElement data:bankname) {
			System.out.println(data.getText());
			
		}
		System.out.println("******************************************");
		List <WebElement> td4 = webtable.findElements(By.xpath("//table[@class='dataTable']//td[4]"));
		for (WebElement data:td4) {
			System.out.println(data.getText());
			
		}
		System.out.println("******************************************");
		List <WebElement> tr4 = webtable.findElements(By.xpath("//table[@class='dataTable']//tr[4]"));
		for (WebElement data:tr4) {
			System.out.println(data.getText());
			
		}
		
		System.out.println("******************************************");
		WebElement icicivalue = webtable.findElement(By.xpath("//table[@class='dataTable']//tr[7]//td[3]"));
		System.out.println(icicivalue.getText());
		driver.close();
	}

}
