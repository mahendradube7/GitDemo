package java_program;

public class Methods2 {

	public static void main(String[] args) {
		// can call public static method in diff class by classname.methodname
		Methods1.m1();

		// can call public non static method in diff class by creating object
		Methods1 obj = new Methods1();
		obj.m2();

	}

}
