package loop_practise_program;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// Write a program to print all natural numbers from 1 to n

		Scanner input = new Scanner (System.in);
		System.out.println("Enter the starting number : ");
		int s = input.nextInt();
		System.out.println("Enter the Ending number : ");
		int e = input.nextInt();
		
		while (s<=e) {
			
			System.out.println(s);
			s++;
		}

		System.out.println("**************************************");
		
		//Write a program to print all natural numbers in reverse


		
		System.out.println("Enter the starting number : ");
		int m = input.nextInt();
		System.out.println("Enter the Ending number : ");
		int n = input.nextInt();
		
		while (m>=n) {
			
			System.out.println(m);
			m--;
		}
	}

}
