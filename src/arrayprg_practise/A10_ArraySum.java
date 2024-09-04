package arrayprg_practise;

public class A10_ArraySum {

	public static void main(String[] args) {
		
		int[] arr = { 22, 24, 444, 455, 66, 7 };

		int temp = 0;
		System.out.print("Array Sum = ");
		for (int i = 0; i < arr.length; i++) {
			temp = temp + arr[i];
		}
		
		System.out.print(temp);
	}
         
}
