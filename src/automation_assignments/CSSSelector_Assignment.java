package automation_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Problem No. 01");
		/* 
		 * Button Exercise: Launch the test browser Open URL:
		 * https://web-locators-static-site-qa.vercel.app/Button Check whether the
		 * “Click this button” button is displayed Check whether the “Click this button”
		 * button is enabled Perform click operation on “Click this button” button
		 */
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Button");
		driver.manage().window().maximize();
        WebElement btn = driver.findElement(By.cssSelector("p[class='buttonContent']"));
        System.out.println(btn.isDisplayed());
        System.out.println(btn.isEnabled());
        btn.click();
        System.out.println("********************************");
    
        System.out.println("Problem No. 02");
		/*
		 * Open url : https://web-locators-static-site-qa.vercel.app/Edit 
		 * Check whether the “Enter your name” textbox is displayed 
		 * Enter/Type your name in the “Enter your name” textbox 
		 * Enter/Type your Nationality
		 */
        
        driver.navigate().to("https://web-locators-static-site-qa.vercel.app/Edit");
        WebElement NameTextbox = driver.findElement(By.cssSelector("input[placeholder='Click here to enter your name here']"));
        System.out.println(NameTextbox.isDisplayed());
        NameTextbox.sendKeys("Mahendra Dube");
        WebElement NationalityTextbox = driver.findElement(By.cssSelector("input[placeholder='Type your nationality']"));
        NationalityTextbox.sendKeys("Indian");
        System.out.println("********************************");
        
        System.out.println("Problem No. 03");
		/*
		 * Open URL: https://web-locators-static-site-qa.vercel.app/Radio 
		 * In the radio button group “Select Your Gender” Check whether the “Female” option is selected by default.
		 *  If “Female” is not selected , select it. 
		 *  Close the browser
		 */
        driver.navigate().to("https://web-locators-static-site-qa.vercel.app/Radio");
        WebElement FBtn = driver.findElement(By.cssSelector("input[value='female']"));
        System.out.println(FBtn.isSelected());
        FBtn.click();
        System.out.println("********************************");
        
        driver.close();
	}

}
