package StringProgram_Practise;

public class P09_DuplicateWordsString {

	public static void main(String[] args) {

		String str = "Mahendra Is a Test is Mahendra";

		// String str1 = str.toLowerCase();

		String[] str2 = str.split(" ");
		
		for (int i = 0 ; i<str2.length; i++) {
			for (int j = i+1; j<str2.length;j++) {
				if (str2[i].equalsIgnoreCase(str2[j])) {
					System.out.println(str2[i]);
				}
			}
		}

	}

}
