package JavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num, digit;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = sc.nextInt();
		int total = num;

		while (num != 0) {

			digit = num % 10; // get the last digit
			sum = sum * 10 + digit;
			num = num / 10; // removed last digit from

		}

		System.out.println("Reverse number is = " + sum);

		if (sum==total) {
			System.out.println("Number is Palindrome Number");
		} else {
			System.out.println("Number is not Palindrome Number");
		}
	}

}
