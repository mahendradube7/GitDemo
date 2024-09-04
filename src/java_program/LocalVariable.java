package java_program;

public class LocalVariable {

	// Local variable can not ACCESS outside method
	public static void m1() {

		int a = 20;
		int b = 40;

		System.out.println(a + b);
	}

	public static void m2() {

		int a = 40;
		int b = 60;

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		m1();
		m2();

	}

}
