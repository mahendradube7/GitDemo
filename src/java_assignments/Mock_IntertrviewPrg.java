package java_assignments;

import java.util.Scanner;

public class Mock_IntertrviewPrg {

	public static void main(String[] args) {
		///Write a Java program to Print the even number only.

		/*
		 * Input: 123456
		 * 
		 * Output: 246
		 */
		
		int num = 123456;
		
		while (num!=0) {
			int digit = num%10;
			if (digit%2==0) {
				System.out.print(digit);
			}
			num=num/10;
		}
		System.out.println();
	 String s = "Infosys";
	 String [] s1= s.split("");
	 System.out.println(s1[4] + s1[5] + s1[6]);
			
		}
	}


