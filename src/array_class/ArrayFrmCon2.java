package array_class;

import java.util.Scanner;

public class ArrayFrmCon2 {

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

		//loop to print data
		System.out.println("Array is = ");
		for (int data : arr) {

			System.out.print(data + " ");

		}

		//reverse array
		System.out.println();
		System.out.println("Reverse Array is = ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		//sum & avg of all array element
		System.out.println();
		int sum = 0;
		for (int data : arr) {
			sum = sum + data;
		}

		System.out.println("Sum = " + sum);
		int avg = sum / size;
		System.out.println("Avg = " + avg);

	}

}
