package StringProgram_Practise;

public class P16_ConcateString {

	public static void main(String[] args) {
		// 20.Java Program to concatenate two strings?

		String a = "Hellow";
		String b = " World";
		String e = "!";

		String c = a.concat(b).concat(e);
		System.out.println(c);
		
		String d = a + b + e;
		System.out.println(d);

	}

}
