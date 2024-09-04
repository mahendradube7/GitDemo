package java_program;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Num");
		int fn = sc.nextInt();
		
		System.out.println("Enter second Num");
		int sn = sc.nextInt();
		
		System.out.println("Enter third Num");
		int tn = sc.nextInt();
		
		
		System.out.println("Multiplication of 3 numbers = " + (fn*sn*tn));
	}

}
