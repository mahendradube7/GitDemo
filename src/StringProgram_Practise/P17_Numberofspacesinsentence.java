package StringProgram_Practise;

public class P17_Numberofspacesinsentence {

	public static void main(String[] args) {
		// 21.Java Program to display number of spaces in sentence?
		
		String s = "JavA Program Java String Practise of Count";
		String s1 = s.replace(" ", "");
		
		int CountSpaces = s.length() - s1.length();
		System.out.println("Number of Spaces : " + CountSpaces);
	}

}
