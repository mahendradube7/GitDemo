package Intrerview_JavaPrograms;

public class Mock {

	public static void main(String[] args) {

		// Write a Java program to Print the even number only.
		// Input: 123456
		// Output: 246

		int num = 123456;
		int digit;
		int digit1;
		int sum = 0;

		// while loop to reverse the number
		while (num != 0) {

			digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}

		// while loop to print output = 246
		while (sum != 0) {
			digit1 = sum % 10;
			if (digit1 % 2 == 0) {
				System.out.print(digit1);
			}
			sum = sum / 10;
		}

	}

}
