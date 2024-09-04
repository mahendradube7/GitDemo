package arrayprg_practise;

import java.util.Arrays;

public class A15_OddandEvenFromArray {

	public static void main(String[] args) {
		int[] arr = { 22, 240, 443, 455, 6, 7 };

		System.out.print("Even = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

		Arrays.sort(arr);
		System.out.println();
		System.out.print("Sort Array = ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
	}
}
