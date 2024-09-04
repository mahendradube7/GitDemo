package arrayprg_practise;

public class A06_ArrayOnOddPosition {

	public static void main(String[] args) {
		
		int[] arr = { 22, 24, 444, 45, 66, 77 };

		// print element of array
		System.out.print("Array = ");
		for (int i = 0; i < arr.length; i++) {
			if(i%2!=0) {
			System.out.print(arr[i] + " ");
			}
		}

	}

	}


