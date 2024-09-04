package java_assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int fact = 1 ; 
		
		while (num!=0) {
			
			fact = num*fact;
			num--;
		}
		System.out.println("Factorial = " + fact);

	}

}
