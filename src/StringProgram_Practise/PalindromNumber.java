package StringProgram_Practise;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");

		int num = sc.nextInt();

		int rem;
		int sum = 0;
		int total = num;
		while (num != 0) {

			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (total == sum) {
			System.out.println(total + " is Palindrom Number");
		}

		else {
			System.out.println(total + " is not Palindrom Number");
		}
		sc.close();
	}

}
