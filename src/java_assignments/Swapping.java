package java_assignments;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value of A ");
		int a = sc.nextInt();
		System.out.println("Enter The value of B ");
		int b = sc.nextInt();

		System.out.println("Before Swapping A = " + a);
		System.out.println("Before Swapping B = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping A = " + a);
		System.out.println("After Swapping B = " + b);

	}

}
