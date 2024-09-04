package java_assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value of A ");
		int a = sc.nextInt();

		int i = 2;

		boolean flag = false;
		
		while (i<=a/2) {
			
			if (a%i==0) {
				flag = true;
				break;
			}
			i++;
		}
       if (!flag) {
    	   System.out.println(a + " is prime number");
    	   
       }
       
       else {
    	   System.out.println(a + " is prime not number");
       }
	}

}
