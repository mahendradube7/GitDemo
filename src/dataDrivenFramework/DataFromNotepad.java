package dataDrivenFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataFromNotepad {

	public static void main(String[] args) throws IOException {
		
		// Importing file Reader Class to identify location of notepad
		FileReader f = new FileReader("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\Assignment\\ReadNotepad.txt");
		
		//Importing BufferedReader Class 
		BufferedReader b = new BufferedReader(f);
		
		System.out.println(b.readLine());

	}

}
