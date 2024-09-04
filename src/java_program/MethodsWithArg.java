package java_program;

public class MethodsWithArg {

	// Creating public static method with argument

	public static void multiply(int n1, int n2) {

		System.out.println(n1 * n2);
	}

	// Creating public non static method with argument

	public void add(int m1, int m2) {

		System.out.println(m1 + m2);
	}

	public static void main(String[] args) {
		// can call public static method directly

		multiply(10,20);
		multiply(5, 7);
		multiply(9, 6);
System.out.println("***************************************************");
		// can call public non static method by creating object
		
		MethodsWithArg obj = new MethodsWithArg();
		obj.add(40, 80);
		obj.add(50, 25);
		obj.add(75, 7);

	}

}
