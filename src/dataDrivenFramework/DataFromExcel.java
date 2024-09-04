package dataDrivenFramework;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class DataFromExcel {

	public static void main(String[] args) throws Exception {

		// Importing FileInputStream Class to to identifying file location
		FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\DataDriven1.xls");

		// opening Identified workbook Excel
		Workbook wb = Workbook.getWorkbook(f);

		// Opening sheet in open workbook
		Sheet s = wb.getSheet("Sheet1");

		// Identifying cell in sheet & read data from cell (c,r)
		System.out.println(s.getCell(0, 1).getContents());
		System.out.println(s.getCell(1, 1).getContents());
		System.out.println(s.getCell(2, 1).getContents());
		System.out.println(s.getCell(6, 9).getContents());
		System.out.println(s.getCell(4, 15).getContents());
		System.out.println(s.getCell(9, 18).getContents());
		
		//Print entire column
		

	}

}
