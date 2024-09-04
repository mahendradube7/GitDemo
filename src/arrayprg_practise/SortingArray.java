package arrayprg_practise;

public class SortingArray {

	public static void main(String[] args) {

		int[] age = { 28, 34, 22, 44, 44, 48, 56, 66, 24 };

		System.out.print("Array is = ");
		for (int data : age) {
			System.out.print(data + " ");
		}

		// Ascending Sorting
		System.out.println();
		int temp = 0;
		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] > age[j]) {
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;

				}

			}
		}
		System.out.print("Sorted array in Descending order is = ");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		// Descending Sorting 
		System.out.println();
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
		System.out.print("Sorted array in Ascending order is = ");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}

		// Duplicate Element
		System.out.println();
		System.out.print("Duplicate Element in Array is  = ");
		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] == age[j]) {
					System.out.print(age[i] + " ");
				}

			}
		}

	}

}
