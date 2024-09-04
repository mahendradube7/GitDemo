package StringProgram_Practise;

public class P01_String_CountTotalNumberOfCharacters {

	public static void main(String[] args) {
		
		String name = "Mahendra Dube";
		
		int count = 0;
		
		for (int i = 0; i<name.length(); i++) {
			
			if (name.charAt(i)!=' ') {
				count++;
			}
		}
			System.out.println("Total Number Of Characters : " + count);
		int n = name.length();
		System.out.println("Length of String : " + n);
		
		

	}

}
