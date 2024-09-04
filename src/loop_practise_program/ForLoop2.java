package loop_practise_program;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		System.out.println("Table of : " + num);
		
		for (int i = 1; i<=10;i++) {
			 System.out.println(num + " * " + i +" = " +i*num);
			
		}
	}

}
