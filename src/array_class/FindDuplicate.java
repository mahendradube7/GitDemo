package array_class;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] age = { 40, 20, 30, 40, 50 };
		
		for (int i = 0; i<age.length; i++) {
			for (int j = i+1;j<age.length;j++ ) {
				if (age[i]==age[j]) {
					System.out.println(age[i] + " ");
				}
			}
		}

	}

}
