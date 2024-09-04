package array_class;

public class SumOfArr2 {

	public static void main(String[] args) {
		
		int[] age = { 28, 34, 22, 44, 48, 56, 66,24};
		int sum=0;
		
		for (int data: age) {
			sum =  sum + data;
		}
		System.out.println("Sum is = " + sum);
		
		int avg = sum/age.length;
		System.out.println("Avg is = " + avg);
		
		int s = 0;
		for (int i = 0; i<age.length; i++) {
			s = age[i]+s;
		}
		System.out.println("Sum is = " + s);
		

	}

}
