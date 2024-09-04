package dataDrivenFramework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInNotepad {

	public static void main(String[] args) throws IOException {
		
		FileWriter f =  new FileWriter("C:\\Users\\Admin\\Desktop\\GrowSkill IT\\Assignment\\WriteNotepad.txt");

		BufferedWriter b = new BufferedWriter(f);
		
		b.write("Hi ! Welcome to Automation Testing");
		
		b.newLine();
		b.write("By Manas Tuwani");
		b.close();
	}

}
