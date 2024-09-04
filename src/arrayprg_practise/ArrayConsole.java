package arrayprg_practise;

import java.util.Scanner;

public class ArrayConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Size of Array = ");
		int size = sc.nextInt();
		
		System.out.println("Enter the " + size + " Elements");
		
		int arr[] = new int [size];
		
		for (int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array = ");
		for (int data: arr) {
			System.out.print(data + " ");
		}

		//Reverse Array
		System.out.println();
		System.out.print("Reverse Array = ");
		for (int i = size-1 ; i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
		// Sum of all array elements
		System.out.println();
		int sum = 0;
		System.out.print("Sum of Array = ");
		for (int data: arr) {
			sum = sum + data;
		}
		System.out.print(sum);
		
		//Avg of Array
		System.out.println();
		System.out.print("Avg of Array = ");
		int avg = sum/size;
		System.out.print(avg);
	}

}
