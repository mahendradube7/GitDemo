package java_program;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		for (int i = 1; i <= 5; i++) {
			int c = a * b;
			System.out.println("C valiue is " + c + " - " + i);
		}
		System.out.println("################################################");

		for (int i = 1; i != 5; i++) {
			int c = a + b;
			System.out.println("C valiue is " + c + " - " + i);
		}
		System.out.println("################################################");

		System.out.println("i is odd");
		for (int i = 1; i <= 10; i = i + 2) {
			int c = a + b;
			System.out.println("C valiue is " + c + " - " + i);
		}
		System.out.println("################################################");

		System.out.println("i is even");
		for (int i = 2; i <= 10; i = i + 2) {
			int c = a + b;
			System.out.println("C valiue is " + c + " - " + i);
		}
		System.out.println("################################################");

		System.out.println("divisible by 4");
		for (int i = 4; i <= 50; i = i + 4) {
			int c = a + b;
			System.out.println("C valiue is " + c + " - " + i);
		}
		System.out.println("################################################");

		System.out.println("divisible by 4");
		for (int i = 4; i <= 50; i = i + 4) {
			int c = a + b;
			System.out.println("C valiue is " + c + " - " + i);
		}
		System.out.println("################################################");

		System.out.println("Table of 3");
		for (int i = 1; i <= 10; i++) {
			int j = i * 3;
			System.out.println("C valiue is " + j + " - " + i);
		}
		System.out.println("################################################");

		System.out.println("Reverse Table of 5");
		for (int i = 10; i >= 1; i--) {
			int j = i * 5;
			System.out.println("J value is " + j + " - " + i);
		}
	}

}
