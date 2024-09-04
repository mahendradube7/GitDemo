package StringProgram_Practise;

public class P14_ReverseString {

	public static void main(String[] args) {
		// 16.Java Program to Reverse String in Java Word by Word (sentence)?

		String s = "India Is My Country";
		String[] arr = s.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
