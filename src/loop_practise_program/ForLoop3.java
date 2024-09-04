package loop_practise_program;

import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the
		// keyboard. 0\

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = input.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}
		System.out.println("Factorial = " + fact);
	}

}
