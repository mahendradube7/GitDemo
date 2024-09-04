package operators_practise_programe;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 1000; i++) {

			if (i % 8 == 5) {
				System.out.println(i);
			}
		}

// find out factors
		System.out.println("*************************************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();

		System.out.print("Factors of " + number + " are: ");

		for (int i = 1; i <= number; ++i) {

			// if number is divided by i
			// i is the factor
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
