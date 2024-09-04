package StringProgram_Practise;

public class P03_RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "Mahendra Testing Vowels and Consonants";
		
		String str1 = str.replaceAll("\\s+", "");
		
		System.out.println("String Before Removing White Spaces :- " + str);
		System.out.println("String After Removing White Spaces :- " + str1);

	}

}
