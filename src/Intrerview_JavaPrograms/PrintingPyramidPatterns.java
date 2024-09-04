package Intrerview_JavaPrograms;

public class PrintingPyramidPatterns {

	// Function to demonstrate printing pattern
	public void printPyramid(int n) {

		// outer loop to handle number of rows n in this case
		for (int i = 0; i < n; i++) {

			// inner loop to handle number of columns values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				System.out.print("* "); // printing stars
			}
			System.out.println(); // ending line after each row
		}
	}

	public static void main(String[] args) {

		PrintingPyramidPatterns star = new PrintingPyramidPatterns();
		star.printPyramid(7);

	}

}
