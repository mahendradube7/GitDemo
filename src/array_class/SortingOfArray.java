package array_class;

import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array = ");
		int size = sc.nextInt();

		System.out.println("Enter " + size + " Element");

		// Loop to accept data into array
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();

		}

		// loop to print data
		System.out.println("Array is = ");
		for (int data : arr) {

			System.out.print(data + " ");

		}

		// Loop to sort array in ascending order

		System.out.println();
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Sorted array in ascending order is = ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		// Loop to sort array in descending order

		System.out.println();
		int temp1 = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}

		System.out.println("Sorted array in descending order is = ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
