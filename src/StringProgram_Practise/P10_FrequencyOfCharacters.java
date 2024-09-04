package StringProgram_Practise;

public class P10_FrequencyOfCharacters {

	public static void main(String[] args) {
		
		String s = "JavA Program Java String Practise of A Count";
		String s1 = s.toLowerCase();
		int totalcount = s1.length();
		int countRemovingA= s1.replace("a","").length();
		
		int CountOfA = totalcount - countRemovingA;
		System.out.println("Count Of 'A' : " + CountOfA );
	}

}
