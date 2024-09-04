package java_program;

public class SplitMethod {

	public static void main(String[] args) {

		String a = "Manas Java and Selenium Classes";
		String b = "Manas";
		String[] arr = a.split(" ");
		

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		System.out.println("******************************");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);
		}

		String[] arr2 = b.split("");
		System.out.println("******************************");
		for (int i = 0; i < arr2.length; i++) {

			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		for (int i = arr2.length - 1; i >= 0; i--) {

			System.out.print(arr2[i]+ " ");
		}
	}

}
