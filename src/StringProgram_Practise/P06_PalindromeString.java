package StringProgram_Practise;

public class P06_PalindromeString {

	public static void main(String[] args) {
		
		String str = "Maam";
		String str1= "";
		
		int length = str.length();
		
		for (int i = length-1; i>=0 ; i--) {
			str1 = str1 + str.charAt(i);
		}
		
		if (str.toLowerCase().equals(str1.toLowerCase())) {
			System.out.println(str + " is palindrome String");
		}
		
		else {
			System.out.println(str + " is not palindrome String");
		}

	}

}
