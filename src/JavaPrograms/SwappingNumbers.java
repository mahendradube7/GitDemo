package JavaPrograms;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number a");
		int a = sc.nextInt();
		System.out.println("Enter The Number b");
		int b = sc.nextInt();

		System.out.println("Before Swapping a = " + a + " b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping a = " + a + " b = " + b);

	}

}
