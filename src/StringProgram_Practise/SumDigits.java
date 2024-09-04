package StringProgram_Practise;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number = ");

		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int total = num;

		while (num != 0) {

			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of each digits of " + total + " is " + sum);

		sc.close();

	}

}
