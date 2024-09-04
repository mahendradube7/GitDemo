package JavaPrograms;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// Reverse The String

		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter The String");
		
		//String s1 = sc.next();

		String s1 = "Mahendra is trying to reverse the string";

		String[] arr = s1.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();
		// Reverse The num

		int num, digit;
		int sum = 0;
		System.out.println("Enter The Number");
	    num = sc.nextInt();
	    
	    while (num!=0) {
	    	
	    	digit = num%10;  //get the last digit
	    	sum = sum*10+digit;
	    	num = num/10; // removed last digit from
	    	
	    }

	    System.out.println("Reverse number is = " + sum);

	}

}
