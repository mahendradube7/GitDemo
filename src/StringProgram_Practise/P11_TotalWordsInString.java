package StringProgram_Practise;

public class P11_TotalWordsInString {

	public static void main(String[] args) {
		// 13.Java Program to find the total number of the char in the given string?
		
		String s = "JavA Program Java String Practise of Count";
		int s1 = s.replace(" " , "").length();
		System.out.println("Count of Total Characters : " + s1);
		
		// 13.Java Program to find the total number of the words in the given string?
		
		String s2 = "India Is My Country";
		String[] arr = s2.split(" ");
		int count = arr.length;
		System.out.println("Count of Total Words : " + count);
	}

}
