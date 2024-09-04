package dataDrivenFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataNotepadMultipleLine {

	public static void main(String[] args) throws IOException   {

		// Importing file Reader Class to identify location of notepad
		FileReader f = new FileReader("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\Assignment\\ReadNotepad.txt");

		// Importing BufferedReader Class
		BufferedReader b = new BufferedReader(f);

		String s;
		
		while ((s=b.readLine())!=null) {
			System.out.println(s);
		}
		
		

	}

}
