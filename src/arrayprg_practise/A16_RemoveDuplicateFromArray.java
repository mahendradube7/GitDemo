package arrayprg_practise;

public class A16_RemoveDuplicateFromArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 2, 3, 3, 4, 4 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
