package automation_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Ass02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://web-locators-static-site-qa.vercel.app/Edit");
        WebElement NameTextbox = driver.findElement(By.cssSelector("input[placeholder='Click here to enter your name here']"));
        System.out.println(NameTextbox.isDisplayed());
        NameTextbox.sendKeys("Mahendra Dube");
        Thread.sleep(3000);
        WebElement NationalityTextbox = driver.findElement(By.xpath("input[placeholder='Type your nationality']"));
        NationalityTextbox.sendKeys("Indian");
        System.out.println("********************************");

	}

}
