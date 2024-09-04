package array_class;

public class Program4 {

	public static void main(String[] args) {
		int[] arr = { 22, 25, 45, 444, 66, 77 };

		// should not print num in between 20 to 29
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 20 && arr[i] <= 29)
				continue;
			System.out.print(arr[i] + " ");

		}

		// should print num in between 20 to 29
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 20 && arr[i] <= 29)

				System.out.print(arr[i] + " ");

		}

	}

}
