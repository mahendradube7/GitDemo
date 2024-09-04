package dataDrivenFramework;

import java.awt.Label;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\DataDrivenWrite.xls");

		WritableWorkbook wb = Workbook.createWorkbook(f);
		
		WritableSheet ws = wb.createSheet("Result", 1);
		
		
		int a = 20;
		int b = 40;
		int c = a*b;
		
		jxl.write.Label l = new jxl.write.Label(0,0 , "C value is : " + c) ;
		
		ws.addCell(l);
		
		//Save & Close
		wb.write();
		wb.close();
	} 

}
