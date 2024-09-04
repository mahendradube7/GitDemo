package StringProgram_Practise;

import java.util.Scanner;

public class AarmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = sc.nextInt();

		int rem;
		double sum = 0;
		int total = num;

		while (num != 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem );
			// sum = sum + Math.pow(rem, 3);
			num = num / 10;
		}
		if (total == sum) {
			System.out.println(total + " is a Aarmstrong Number");
		} else {
			System.out.println(total + " is not a Aarmstrong Number");
		}
		sc.close();
	}

}
