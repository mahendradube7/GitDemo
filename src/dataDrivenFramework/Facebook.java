package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Facebook {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {

		
		FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\DataDriven1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver",
				s.getCell(1, 13).getContents());
		WebDriver driver = new ChromeDriver();
		driver.get(s.getCell(1, 1).getContents());
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id(s.getCell(1, 8).getContents())).sendKeys(s.getCell(1, 4).getContents());
		Thread.sleep(2000);
		driver.findElement(By.id(s.getCell(1, 9).getContents())).sendKeys(s.getCell(1, 5).getContents());
		Thread.sleep(2000);
		driver.findElement(By.name(s.getCell(1, 10).getContents())).click();
		//Thread.sleep(10000);
		//driver.close();
	
	
	
	}

}
