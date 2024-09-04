package StringProgram_Practise;

public class PalindromString {

	public static void main(String[] args) {

		String s = "Maam";
		String s1 = "";

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		if (s.toLowerCase().equals(s1.toLowerCase())) {
			System.out.println("String is Palindrom");
		} else {
			System.out.println("String is not Palindrom");
		}
	}

}
