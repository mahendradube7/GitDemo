package java_assignments;

import java.util.Scanner;

public class AarmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int digit;
		int sum = 0;
		int total = num;

		while (num != 0) {

			digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		System.out.println(sum);
		if (sum == total) {
			System.out.println("Number is Aarm");
		} else {
			System.out.println("Number is not Aarm");
		}

	}
}
