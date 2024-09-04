package arrayprg_practise;

public class A04_ReverseArray {

	public static void main(String[] args) {
		
		int [] arr1 = { 1, 2, 2, 3, 3, 4, 4 };
		
		for (int i = arr1.length-1 ; i>=0; i--) {
			System.out.print(arr1[i] + " ");
		}
	}

}
