package JavaPrograms;

import java.util.Scanner;

public class AarmstronNum {

	public static void main(String[] args) {

		int digit;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int total = num;

		while (num != 0) {

			digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if (sum == total) {
			System.out.println("Number is Aarmstrong");
		} else {
			System.out.println("Number is not Aarmstrong");
		}
	}

}
