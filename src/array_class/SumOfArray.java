package array_class;

public class SumOfArray {

	public static void main(String[] args) {

		int sum = 0;
		int[] age = { 28, 34, 22, 44, 48, 56, 66, 24 };

		for (int data : age) {
			sum = sum + data;
		}
		System.out.println("Sum = " + sum);
		int avg = sum / age.length;
		System.out.println("Avag =  " + avg);
	}
}
