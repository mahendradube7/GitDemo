package arrayprg_practise;

public class SecondLargest_InArray {

	public static void main(String[] args) {
		int[] age = { 20, 40, 15, 60, 100, 80, 25 };

		// Descending Sorting
		int temp1 = 0;
		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] < age[j]) {
					temp1 = age[i];
					age[i] = age[j];
					age[j] = temp1;
				}

			}
		}
		System.out.print("Second Largest = ");
		System.out.println(age[1]);

	}

}
