package array_class;

import java.util.Scanner;

public class ArrayFromConsol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of an Array");

		int size = sc.nextInt();

		System.out.println("Enter the " + size + " Elements");

		System.out.println("Array is : ");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}

		for (int res : arr) {
			System.out.print(res + " ");
		}

		System.out.println();
		System.out.println("Reverse Array is: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		int sum = 0;
		for (int data : arr) {
			sum = sum + data;
		}
		System.out.println("Sum = " + sum);
		int avg = sum / arr.length;
		System.out.println("Avag =  " + avg);

	}

}
