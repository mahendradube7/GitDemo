package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
        int f = 1;
		while (num != 0) {
		
			f = num*f;
			num--;
		}
		
		System.out.println("Factorial of number is = " + f);
	}

}
