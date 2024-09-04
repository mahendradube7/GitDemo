package automation_assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebTablePractise {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\GrowSkill IT\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement WBTable = driver.findElement(By.xpath("//table[@name= 'BookTable']"));

		List<WebElement> tr = WBTable.findElements(By.tagName("tr"));
		List<WebElement> tc = WBTable.findElements(By.tagName("th"));
		List<WebElement> td = WBTable.findElements(By.tagName("td"));
		
		System.out.println("Total number of rows are : " + tr.size());
		System.out.println("Total number of coloumns are : " + tc.size());
		System.out.println("Total number of data are : " + td.size());
		
		List<WebElement> totalrows = WBTable.findElements(By.xpath("//table[@name= 'BookTable']//tr"));
		System.out.println("Total number of rows are = " + totalrows.size());

		List<WebElement> totalColumns = WBTable.findElements(By.xpath("//table[@name= 'BookTable']//th"));
		System.out.println("Total number of coloumns are = " + totalColumns.size());

		List<WebElement> totaldata = WBTable.findElements(By.xpath("//table[@name= 'BookTable']//td"));
		System.out.println("Total number of data are = " + totaldata.size());

		WebElement learnSelenim = WBTable.findElement(By.xpath("//table[@name= 'BookTable']//tr[2]//td[1]"));
		System.out.println(learnSelenim.getText());

		WebElement tr2 = WBTable.findElement(By.xpath("//table[@name= 'BookTable']//tr[2]"));
		System.out.println(tr2.getText());

		System.out.println("******************************************************");

		List<WebElement> thead = WBTable.findElements(By.xpath("//table[@name= 'BookTable']//th"));
		System.out.println("Table Header Names Are = ");
		for (WebElement data : thead) {
			System.out.println(data.getText());
		}

		System.out.println("******************************************************");

		List<WebElement> sub = WBTable.findElements(By.xpath("//table[@name= 'BookTable']//td[3]"));
		System.out.println("Subject Names Are = ");
		for (WebElement data : sub) {
			System.out.println(data.getText());
		}
		
		Point p = driver.findElement(By.xpath("//table[@name= 'BookTable']")).getLocation();
		System.out.println(p);
		
		//Explicit wait
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(305, 1463)");
		Thread.sleep(2000);
		
		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\Screenshot\\" + driver.getTitle() + ".png"));
		
		driver.close();
	}

}
