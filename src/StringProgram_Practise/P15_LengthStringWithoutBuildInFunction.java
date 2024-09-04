package StringProgram_Practise;

public class P15_LengthStringWithoutBuildInFunction {

	public static void main(String[] args) {
		// 19.Java Program to find length of string without built in functions?
		
		String s1 = "India";
		System.out.println(s1.length());
		String[] arr1 = s1.split("");
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			count++;
		}
		System.out.println(count);

	}

}
