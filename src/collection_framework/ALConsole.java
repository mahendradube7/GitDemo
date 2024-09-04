package collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class ALConsole {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the The values of ArrayList = ");

		for (Integer i = 0; i <= 3; i++) {
			int val = sc.nextInt();
			l.add(val);
		}

		System.out.print("ArrayList = ");
		for (int data : l) {
			System.out.print(data + " ");
		}
	}

}
