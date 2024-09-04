package java_program;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.add(10, 20);
		m.add(5, 15, 25);
		m.add(4, 2, 6, 8);
		m.add(6, 45);

	}

}
