package StringProgram_Practise;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number A");
		int a = sc.nextInt();
		System.out.println("Enter the Number B");
		int b = sc.nextInt();

		System.out.println("Before Swapping Num A = " + a + " Num B = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping Num A = " + a + " Num B = " + b);

		sc.close();
	}

}
