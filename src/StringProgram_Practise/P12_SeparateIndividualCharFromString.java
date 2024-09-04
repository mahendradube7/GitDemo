package StringProgram_Practise;

public class P12_SeparateIndividualCharFromString {

	public static void main(String[] args) {
		// 14.Java Program to separate the Individual Characters from a String?

		String s2 = "India";
		String[] arr = s2.split("");

		for (String Data : arr) {
			System.out.println(Data);
			// System.out.print(Data +" ");
		}

	}

}
