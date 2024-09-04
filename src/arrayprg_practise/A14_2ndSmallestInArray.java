package arrayprg_practise;

public class A14_2ndSmallestInArray {

	public static void main(String[] args) {
		
		int[] arr = { 22, 240, 444, 455, 6, 7 };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Smallest = " + arr[0]);
		System.out.println("2nd Smallest = " + arr[1]);
	}

}
