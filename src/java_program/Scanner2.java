package java_program;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name");

		String FN = sc.next();

		System.out.println("Enter Middle Name");

		String MN = sc.next();

		System.out.println("Enter Last Name");

		String LN = sc.next();
		
		String FullName =  FN + " "+ MN + " "+ LN;
		System.out.println("Full Name:- " + FullName );
		
		if (FullName.contains("Mahendra")) {
			
			System.out.println("User is correct");
		}
		
		else {
			System.out.println("User is incorrect");
		}

	}

}
