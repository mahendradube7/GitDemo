package StringProgram_Practise;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		long num = sc.nextInt();
		long fact = 1;

		for (long i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of Num = " + fact);
		sc.close();
	}

}
