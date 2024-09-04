package java_assignments;

public class Assignment1 {

	public static void main(String[] args) {

		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";

		// Problem 1 = Verify length of the A variable should be greater than length of
		// the C variable and should be less than length of the B variable.

		if (a.length() > c.length() && a.length() < b.length()) {

			System.out.println("Problem 1 is passed");

		}

		else {
			System.out.println("Problem 1 is failed");
		}

		// Problem 2 = A variable should not be same as B variable and C variable

		if (a.equals(b) && a.equals(c)) {

			System.out.println("Problem 2 is failed");
		} else {
			System.out.println("Problem 2 is passed");

		}
	}
}
