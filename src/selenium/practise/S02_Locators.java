package selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		System.out.println("Title" + driver.getTitle());
		System.out.println("URL" + driver.getCurrentUrl());
		
		WebElement name = driver.findElement(By.id("name"));
		boolean nameDisplayed = name.isDisplayed();
		System.out.println(nameDisplayed);
		name.sendKeys("Mahendra");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mahendra@gmail.com");
		boolean emailEnabled = email.isEnabled();
		System.out.println(emailEnabled);

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("31121425");

		WebElement address = driver.findElement(By.id("textarea"));
		address.sendKeys("Maharashtra");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id = 'male']"));
		boolean isSelected = gender.isSelected();
		System.out.println(isSelected);
		
		WebElement country = driver.findElement(By.xpath("//label[text()='Country:']"));
		System.out.println(country.getAttribute("for"));
		System.out.println(country.getTagName());
		System.out.println(country.getText());
		System.out.println(country.getSize());
		
		

		Thread.sleep(5000);
		driver.close();

	}

}
