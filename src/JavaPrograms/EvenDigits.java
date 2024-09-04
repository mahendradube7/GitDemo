package JavaPrograms;

public class EvenDigits {

	public static void main(String[] args) {
		
		//1.     Write a Java program to Print the even number only.

//Input: 123456

//Output: 246

		int num = 123456; // 246
		int digit;

		while (num != 0) {
			digit = num % 10;
			if (digit % 2 == 0) {
				System.out.print(digit);
			}
			num = num / 10;

		}

	}

}
