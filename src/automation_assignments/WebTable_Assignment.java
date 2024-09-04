package automation_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Assignment {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
		driver.manage().window().maximize();

		//Open URL: https://web-locators-static-site-qa.vercel.app/Web%20Table
		//Select “Static Table - Subject Topper” table
		WebElement SubjectTopperTable = driver.findElement(By.xpath("//span[text()='Static Table - Subject Topper']"));
		SubjectTopperTable.click();
		
		//Locating WebTable
		WebElement WBTable = driver.findElement(By.xpath("//table[@class = 'MuiTable-root css-1owb465']"));
		
		//List/Print the names of all header columns
		System.out.println("Names of all Header Columns are = ");
		List <WebElement> hc = WBTable.findElements(By.xpath("//table[@class = 'MuiTable-root css-1owb465']//thead//tr"));
		for (WebElement data : hc) {
			System.out.println(data.getText());
		}
		
		//Print all the subject name from column 2
		System.out.println("**************************************************");
		System.out.println("Names of all Subjects are = ");
		List <WebElement> SubjectData = WBTable.findElements(By.xpath("//table[@class = 'MuiTable-root css-1owb465']//td[2]"));
		for (WebElement data1 : SubjectData) {
			System.out.println(data1.getText());
		}
		
		//close the browser
		driver.close();
		
	}

}
