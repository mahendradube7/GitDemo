package Intrerview_JavaPrograms;

public class LargestValueFromTheGivenArray {

	public static void main(String[] args) {

		int[] num = { 11, 5477, 66, 95, 549, 54650, 46 };

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}

		}
		System.out.println(max);
	}
}
