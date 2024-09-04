package array_class;

public class PrintArrayElement {

	public static void main(String[] args) {

		int[] arr = { 22, 24, 444, 45, 66, 77 };

		// print element of array
		System.out.print("Array = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// print element of array for each loop
		System.out.println();
		System.out.print("Array = ");

		for (int ar : arr) {
			System.out.print(ar + " ");

		}

		// print element of array in reverse
		System.out.println();
		System.out.print("Reverse Array = ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
