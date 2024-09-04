package StringProgram_Practise;

public class P02_VowelsConsonants {

	public static void main(String[] args) {

		int Vcount = 0;
		int Ccount = 0;
		String str = "Mahendra Testing Vowels and Consonants";

		str = str.toLowerCase();

		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				Vcount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				Ccount++;
			}

		}
		System.out.println("Count of Vowels = " + Vcount);
		System.out.println("Count of Consonants = " + Ccount);
	}

}
