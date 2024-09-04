package Intrerview_JavaPrograms;

public class Repative {

	public static void main(String[] args) {

		String s1 = "Manassasnnnnaaaaeeee";
		String s3 = "";

		String[] s2 = s1.split("");

		for (int i = 0; i < s2.length; i++) {
			for (int j = i + 1; j < s2.length; j++) {
				if (s2[i].equals(s2[j])) {
					if (s3.contains(s2[i]) == false)
						// System.out.println(s2[i]);
						s3 = s3 + s2[i];
				}

			}

		}
		System.out.println(s3);
	}

}
