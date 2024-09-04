package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class PrintingRows {

	public static void main(String[] args) throws BiffException, IOException {

		// Importing FileInputStream Class to to identifying file location
		FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\DataDriven1.xls");

		// opening Identified workbook Excel
		Workbook wb = Workbook.getWorkbook(f);

		// Opening sheet in open workbook
		Sheet s = wb.getSheet("Sheet1");
		
		//count how many rows we have
		int rc = s.getRows();
		
		//print 1st column
		for (int i=0;i<rc;i++) {
			System.out.println(s.getCell(0, i).getContents());
		}
		

	}

}
