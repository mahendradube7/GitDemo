package StringProgram_Practise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number = ");

		int num = sc.nextInt();

		int rem;
		int sum = 0;
		int total = num;
		while(num!=0) {
			rem = num%10;  // (1) for Ex. num = 123 then rem = 3  (2) num = 12 then rem = 2 (3) 1
			sum=sum*10+rem; // (1) sum = 3 // (2) 3*10+2 = 32 (3) 32*10+1 = 321
			num=num/10;     // (1) 12 (2) 1 (3) 0 ---- Loop end
		}
		System.out.println("Reverse of Number " + total + " is " + sum);

		sc.close();
	}

}
