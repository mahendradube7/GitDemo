package Intrerview_JavaPrograms;

import java.util.Scanner;

public class PrimNnumbersbetween1_100 {

	public static boolean isPrime(int n) {

		if (n == 1 || n == 0)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number upto user want Prime Numbers : ");
		int num = sc.nextInt();
		
		for (int i=1 ; i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(+i + " ");
			}
			
			sc.close();
		}

	}

}
