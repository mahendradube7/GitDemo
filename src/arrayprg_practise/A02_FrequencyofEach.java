package arrayprg_practise;

public class A02_FrequencyofEach {

	public static void main(String[] args) {
		int[] age = { 28, 34, 22, 44, 44, 48, 56, 66, 24 };

		int temp = 0;
		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[j] == age[i]) {
                         temp++;
				}

			}
System.out.println(age[i] + " " + temp);
		}
	}
}
