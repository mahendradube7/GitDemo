package java_assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();  
		int digit;
		int sum = 0;
		
		while (num!=0) {
			
			digit = num%10;  
			sum = sum*10+digit;  
			num = num/10;
		}
System.out.println("Reverse Number is = " +sum);
	}

}
