package array_class;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		int[] arr = { 22, 25, 444, 45, 66, 77 };

		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		String[] name = { "Rohit", "Virat", "Mahendra" };

		for (String data : name) {
			System.out.print(data + " ");
		}

	}

}
