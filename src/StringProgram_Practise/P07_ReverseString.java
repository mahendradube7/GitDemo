package StringProgram_Practise;

public class P07_ReverseString {

	public static void main(String[] args) {

		String s = "ardnehaM ebuD";
		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}
}
