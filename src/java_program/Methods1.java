package java_program;

public class Methods1 {

	// Creating public static method
	public static void m1() {
		int a = 100;
		int b = 200;
		System.out.println(a + b);
	}

	// Creating public non static method
	public void m2() {

		int a = 10;
		int b = 15;
		System.out.println(a * b);
	}

	
	public static void main(String[] args) {
		// can call public static method directly

		m1();

		// can call public non static method by creating object

		Methods1 obj = new Methods1();
		obj.m2();

	}

}
