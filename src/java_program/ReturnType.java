package java_program;

public class ReturnType {

	public static int m1() {
		int a = 20;
		int b = 30;
		int c = a + b;
		return c;
	}

	public String m2() {

		String a = "Manas";
		String b = " QA";
		System.out.println(a);
		return a.concat(b);
	}

	public boolean m3() {
		String a = "Manas";
		String b = " QA";

		return b.startsWith("M");

	}

	public int add(int a, int b) {

		int c = a + b;
		return c;

	}

	public static void main(String[] args) {

		System.out.println(m1());

		ReturnType obj = new ReturnType();
		System.out.println(obj.m2());
		System.out.println(obj.m3());
		System.out.println(obj.add(7, 13));
	}

}
