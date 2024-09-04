package StringProgram_Practise;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Mahendra Dube Reverse The String";

		// String m = "Mahendra";
		String[] arr = s.split(" ");
		

		System.out.println("Reverse String = ");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}

	}

}
