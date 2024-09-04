package array_class;

public class ArrayProgram3 {

	public static void main(String[] args) {
		int[] arr = { 22, 25, 444, 45, 66, 77 };

		// print even element of array
		System.out.print("Even Array = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}

		// print odd element of array
		System.out.println();
		System.out.print("Odd Array = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}

	}

}
